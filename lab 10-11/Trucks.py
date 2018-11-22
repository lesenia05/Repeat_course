from Car import Car

class Trucks (Car):
    def __init__(self,number_of_passengers, gearbox,cargo_capacity):
        super(Trucks, self).__init__(self,number_of_passengers, gearbox)
        self.cargo_capacity=cargo_capacity

        def __str__(self):
            return super(Trucks, self).__str__() + ' cargo_capacity = ' \
                   + str(self.cargo_capacity)