package Task2;

import Task2.carshop.cars.Ford;
import Task2.carshop.cars.Sedan;
import Task2.carshop.cars.Truck;
import Task2.carshop.impl.MyOwnAutoShop;

public class Main {
    public static void main(String[] args){
        MyOwnAutoShop myShop = new MyOwnAutoShop();
        myShop.arr[0] = new Sedan(110, false, 300, "white", 30);
        myShop.arr[1] = new Ford(120, false, 250, "red", 1222);
        myShop.arr[2] = new Ford(140, false, 400, "black", 1989);
        myShop.arr[3] = new Truck(100, false, 300, "blue", 100);
        myShop.arr[4] = new Truck(90, false, 200, "black", 200);

        myShop.getCarsPrice();
        myShop.getCarColors();
        myShop.getCarPrice(1);
        myShop.getCarColor(2);
        myShop.purchaseCar(1);
        myShop.purchaseCar(2);
        System.out.println(myShop.getIncome());


    }
}
