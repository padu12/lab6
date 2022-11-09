package Task2.carshop.cars;

public abstract class Car {
    int speed;
    boolean isSellOut;
    double regularPrice;
    String color;
    abstract public double getSalePrice() ;
    abstract public String getColor();


}
