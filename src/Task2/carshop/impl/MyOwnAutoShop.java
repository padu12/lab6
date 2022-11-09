package Task2.carshop.impl;

import Task2.carshop.cars.Car;
import Task2.carshop.cars.Ford;
import Task2.carshop.interfaces.Admin;
import Task2.carshop.interfaces.Customer;

public class MyOwnAutoShop implements Admin, Customer {
    double income;
    public Car[] arr = new Car[5];

    @Override
    public double getIncome() {
        return income;
    }

    @Override
    public double getCarsPrice() {
        for(int i = 0; i<arr.length; i++){
            System.out.println("arr1["+ i +"] = " + arr[i].getSalePrice());
        }
        System.out.println();
        return 0;
    }

    @Override
    public String getCarColors() {
        for(int i = 0; i<arr.length; i++){
            System.out.println("arr1["+ i +"] = " + arr[i].getColor());
        }
        System.out.println();
        return null;
    }

    @Override
    public double getCarPrice(int id) {
        System.out.println("arr1["+ id +"] = " + arr[id].getSalePrice());
        return 0;
    }

    @Override
    public String getCarColor(int id) {
        System.out.println("arr1["+ id +"] = " + arr[id].getColor());
        return null;
    }

    @Override
    public void purchaseCar(int id) {
        income += arr[id].getSalePrice();
    }
}
