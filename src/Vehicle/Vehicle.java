package Vehicle;

public class Vehicle {

    int maxSpeed;
    String brand;
    int weight;
    int power;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Vehicle(int maxSpeed, String brand, int weight, int power) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "{" +
                "Максимальная скорость=" + maxSpeed+"км/ч"+
                ", Марка=" + brand +
                ", Вес=" + weight+"т" +
                ", Мощность=" + getPowerOnKv()+"кВ";
    }

    public double getPowerOnKv(){
        double powerOnKv = power*0.74;
        return powerOnKv;
    }

}
