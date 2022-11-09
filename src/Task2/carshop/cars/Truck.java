package Task2.carshop.cars;

public class Truck extends Car{
    int weight;

    public Truck(int speed, boolean isSellOut, double regularPrice, String color, int weight){
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight>2000) regularPrice *= 0.9;
        return regularPrice;
    }

    @Override
    public String getColor (){
        return this.color;
    }
}
