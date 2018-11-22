class Car:

    def __init__(self, number_of_passengers=4, gearbox="auto"):
        self.number_of_passengers = number_of_passengers
        self.gearbox = gearbox

    def _init_(self, maximum_speed=120, fuel_consumption=1.2, brand="audi"):
        self.maximum_speed = maximum_speed
        self.fuel_consumption = fuel_consumption
        self.brand = brand

    def __str__(self):
        return ' number_of_passengers= ' + str(self.number_of_passengers) + ' gearbox = ' \
               + str(self.gearbox) + ' maximum_speed = ' + str(self.maximum_speed) +\
               ' fuel_consumption = ' + str(self.fuel_consumption) +\
               '  brand = ' + str(self. brand)