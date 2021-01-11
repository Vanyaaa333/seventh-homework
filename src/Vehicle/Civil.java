package Vehicle;

import java.util.Scanner;

public class Civil extends Vehicle{

    int countOFPassengers;
    boolean isBusinessClass;

    public Civil(int maxSpeed, String brand, int weight, int power, int countOFPassengers, boolean isBusinessClass) {
        super(maxSpeed, brand, weight, power);
        this.countOFPassengers = countOFPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    public void isCountOfPassengersPlaceEnough(){
        System.out.println("Введете ,требуемое кол-во пассажирских мест:");
        Scanner sc = new Scanner(System.in);
        int inputCountOfPassengersPlace = sc.nextInt();
        if(inputCountOfPassengersPlace<countOFPassengers){
            System.out.println("Самолет загружен");
        }
        else{
            System.out.println("Вам нужен самолет побольше");
        }
    }

    @Override
    public String toString() {
        return "Гражданский самолет"+super.toString()
                +", Колличество сидячих мест="+countOFPassengers
                +", Наличие безнес класса="+isBusinessClass
                +", Размах крыльев="+Air.getWingSpan()+"м"
                +", Минимальная длина взлётно-посадочной полосы для взлёта="+Air.getMinLengthOfRunwayStrip()+"м"+"}";
    }
}
