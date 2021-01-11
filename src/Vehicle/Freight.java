package Vehicle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Freight extends Vehicle {

    int carrying;

    public Freight(int maxSpeed, String brand, int weight, int power, int carrying) {
        super(maxSpeed, brand, weight, power);
        this.carrying = carrying;
    }

    public void isWeightRight(){
        System.out.println("Ввидете ,вес требуемый для загрузки в тоннах:");
        Scanner sc = new Scanner(System.in);
        int inputWeight = sc.nextInt();
        if(inputWeight<carrying){
            System.out.println("Грузовик загружен");
        }
        else{
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public String toString() {
        return "Грузовик"+super.toString()
                +", Грузоподъемность="+carrying+"т"
                +", Количество колес="+LandTransport.getCountOfWheels()
                +", Расход топлива="+LandTransport.getFuelConsumption()+"л"+"}";
    }
}
