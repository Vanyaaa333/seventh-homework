package Vehicle;

public class LandTransport {

    public static double fuelConsumption;
    public static int countOfWheels;

    public LandTransport(double fuelConsumption, int countOfWheels) {
        this.fuelConsumption = fuelConsumption;
        this.countOfWheels = countOfWheels;
    }

    public static double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public static int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }
}
