from flask import request
from app import app
from app import db
from bus import Bus

from app import ma

class InsuranceStructure(ma.Schema):
    class Meta:
        fields = ('id','number_of_passengers', 'gearbox', 'number_of_flights')


@app.route('/')
def index():
    return '<h1> Ok! </h1>'

@app.route('/buss/<id>', methods=['GET'])
def get_bus(id):
    find_bus = Bus.query.get(id)
    if find_bus is not None:
        return find_bus.__str__()
    else:
        return "Not found"


@app.route('/buss', methods=['POST'])
def add_bus():
    id = request.json['id']
    number_of_passengers = request.json['number_of_passengers']
    gearbox = request.json['gearbox']
    number_of_flights = request.json['number_of_flights']

    new_bus = Bus
    new_bus.id = id
    new_bus.number_of_passengers = number_of_passengers
    new_bus.gearbox = gearbox
    new_bus.number_of_flights = number_of_flights

    db.session.add(new_bus)
    db.session.commit()

    return 'Ok'


@app.route('/buss/<id>', methods=['PUT'])
def update_bus(id):
    id = request.json['id']
    number_of_passengers = request.json['number_of_passengers']
    gearbox = request.json['gearbox']
    number_of_flights = request.json['number_of_flights']

    new_bus = Bus.query.get(id)
    new_bus.id = id
    new_bus.number_of_passengers = number_of_passengers
    new_bus.gearbox = gearbox
    new_bus.number_of_flights = number_of_flights

    db.session.commit()

    return "Ok"


@app.route('/buss/<id>', methods=['DELETE'])
def delete_bus(id):
    bus = Bus.query.get(id)
    db.session.delete(bus)
    db.session.commit()

    return str("Ok")