package Task2.carshop.cars;

public class Sedan extends Car{
    int length;

    public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length){
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) regularPrice *= 0.95;
        return regularPrice;
    }

    @Override
    public String getColor (){
        return this.color;
    }
}
