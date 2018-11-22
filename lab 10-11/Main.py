from CarManager import CarManager
from Car import Car
from Bus import Bus
from Trucks import Trucks
from ElectroCar import ElectroCar
if __name__ == '__main__':

    my_car_manager = CarManager

    my_car_manager.cars_list.append(Bus(24,"manual",3))
    my_car_manager.cars_list.append(Bus(21, "manual", 2))
    my_car_manager.cars_list.append(Trucks(2, "manual", 1000))
    my_car_manager.cars_list.append(Trucks(2, "manual", 2000))
    my_car_manager.cars_list.append(ElectroCar(4, "auto", 26))
    my_car_manager.cars_list.append(ElectroCar(4, "auto", 30))

    my_car_manager.sort_by_maximum_speed()
    print("Sorted list")
    my_car_manager.cars_list()

    my_car_manager.sort_by_fuel_consumption()
    print("Sorted list")
    my_car_manager.cars_list()

    my_car_manager.sort_by_brand()
    print("Sorted list")
    my_car_manager.cars_list()