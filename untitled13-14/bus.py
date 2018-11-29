from app import db

class Bus(db.Model):
    __tablename__ = "bus"
    id = db.Column('id', db.Integer, primary_key=True)
    number_of_passengers = db.Column('number_of_passengers', db.Integer)
    gearbox = db.Column('gearbox', db.String)
    number_of_flights = db.Column('number_of_flights', db.Integer)

    def __str__(self):
        return str("id = " + str(self.id) + "\nnumber_of_passengers = " +
                   str(self.number_of_passengers) + "\ngearbox = " +
                   str(self.gearbox) + "\nnumber_of_flights = " + str(self.number_of_flights))