package Vehicle;

public class Light extends Vehicle {
    String bodyType;
    int countOfPassengers;
    int timeOfTraveled;
    public double allKmsRoad;
    public double amountOfFuelConsumed;

    public Light(int maxSpeed, String brand, int weight, int power, String bodyType, int countOfPassengers, int timeOfTraveled) {
        super(maxSpeed, brand, weight, power);
        this.bodyType = bodyType;
        this.countOfPassengers = countOfPassengers;
        this.timeOfTraveled = timeOfTraveled;
    }

    public void numbOfTraveledKmsAndPrintResult() {
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
