from flask import Flask, jsonify, abort, make_response, request
from bus import Bus

app = Flask(__name__)

bus = {'1': Bus(24,"manual",3),
        '2': Bus(32,"manual",2)}


@app.route('/bus/<id>', methods=['GET'])
def get_bus(id):
    if id in bus:
        return bus[id].__dict__.__str__()
    else:
        abort(404)


@app.route('/bus', methods=['POST'])
def post_bus():
    post_data = request.get_json()
    id = post_data['id']
    number_of_passengers= post_data['number_of_passengers']
    gearbox = post_data['gearbox']
    number_of_flights = post_data['number_of_flights']

    new_bus = Bus(number_of_passengers, gearbox, number_of_flights)
    bus[id] = new_bus
    return 'Posted  ' + str(bus.get(id).number_of_flights)


@app.route('/accommodation', methods=['PUT'])
def put_accommodation():
    post_data = request.get_json()
    id = post_data['id']
    number_of_passengers = post_data['number_of_passengers']
    gearbox = post_data['gearbox']
    number_of_flights = post_data['number_of_flights']

    new_bus = Bus(number_of_passengers, gearbox, number_of_flights)
    bus[id] = new_bus
    return 'Put'


@app.route('/bus/<id>', methods=['DELETE'])
def delete_bus(id):
    bus.pop(id)
    return 'Deleted'


@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not found'}), 404)


if __name__ == '__main__':
    app.run(debug=True)