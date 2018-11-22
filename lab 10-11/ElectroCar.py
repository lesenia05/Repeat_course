from Car import Car

class ElectroCar(Car):
    def __init__(self,number_of_passengers, gearbox,battery_capacity):
        super(ElectroCar, self).__init__(self,number_of_passengers, gearbox)
        self.battery_capacity = battery_capacity

def __str__(self):
    return super (ElectroCar, self).__str__() + ' battery_capacity = ' \
           + str(self.battery_capacity)