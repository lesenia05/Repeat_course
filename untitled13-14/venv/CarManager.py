from operator import attrgetter

class CarManager:

    cars_list = []

    def sort_by_maximum_speed(cars_list):
        return sorted(cars_list, key=attrgetter('maximum_speed'))

    def sort_by_fuel_consumption(cars_list):
        return sorted(cars_list, key=attrgetter('fuel_consumption'))

    def sort_by_brand(cars_list):
        return sorted(cars_list, key=attrgetter('brand'))
