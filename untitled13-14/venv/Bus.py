from Car import Car

class Bus(Car):
    def __init__(self,number_of_passengers, gearbox, number_of_flights):
        super(Bus, self).__init__(self,number_of_passengers, gearbox)
        self.number_of_flights =number_of_flights

        def __str__(self):
            return super(Bus, self).__str__() + 'number_of_flights = ' \
                   + str(self.number_of_flights)