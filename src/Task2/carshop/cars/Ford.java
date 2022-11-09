package Task2.carshop.cars;

public class Ford extends Car{
    int year;
    int manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year){
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
        this.year = year;
    }

    @Override
    public double getSalePrice(){
        regularPrice *= 1-manufacturerDiscount;
        return regularPrice;
    }

    @Override
    public String getColor (){
        return this.color;
    }
}
