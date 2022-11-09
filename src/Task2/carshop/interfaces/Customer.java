package Task2.carshop.interfaces;

import Task2.carshop.cars.Car;

public interface Customer {
    double getCarsPrice();
    String getCarColors();
    double getCarPrice(int id);
    String getCarColor(int id);
    void purchaseCar(int id);

}
