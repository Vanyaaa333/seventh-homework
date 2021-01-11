package Vehicle;

import java.util.Scanner;

public class Light extends Vehicle {
    String bodyType;
    int countOfPassengers;
    public double allKmsRoad;
    public double amountOfFuelConsumed;

    public Light(int maxSpeed, String brand, int weight, int power, String bodyType,int countOfPassengers) {
        super(maxSpeed, brand, weight, power);
        this.bodyType = bodyType;
        this.countOfPassengers = countOfPassengers;
    }

    public void numbOfTraveledKmsAndPrintResult() {
        System.out.println("Введите кол-во часов в дороге:");
        Scanner sc  = new Scanner(System.in);
        int timeOfTraveled = sc.nextInt();
        allKmsRoad = maxSpeed * timeOfTraveled;
        amountOfFuelConsumed = getAmountOfFuel();
        System.out.printf("За время %d ч, автомобиль %s двигаясь с максимальной скоростью %d км/ч проедет %.2f км и израсходует %.2f литров топлива.\n"
                ,timeOfTraveled,
                brand,
                maxSpeed,
                allKmsRoad,
                amountOfFuelConsumed);
    }

    private double getAmountOfFuel() {
        amountOfFuelConsumed = (allKmsRoad / 100) * LandTransport.fuelConsumption;
        return amountOfFuelConsumed;
    }

    @Override
    public String toString() {
        return "Легковая"+super.toString()
                +", Колличество пассажиров="+countOfPassengers
                +", Тип кузова="+bodyType
                +", Количество колес="+LandTransport.getCountOfWheels()
                +", Расход топлива="+LandTransport.getFuelConsumption()+"л"+"}";
    }
}
