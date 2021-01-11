import Vehicle.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вывод работы с классом легковых машин:");
        LandTransport lightTransportCharacteristics = new LandTransport(7.4 , 4);
        Light audi = new Light(220,"audi a6",2,180,"купе", 5);
        audi.numbOfTraveledKmsAndPrintResult();
        System.out.println(audi.toString());

        System.out.println("----------------------------\n"+"Вывод работы с классом грузовиков:");
        LandTransport freightTransportCharacteristics = new LandTransport(18.8 , 4);
        Freight mercedes = new Freight(200,"Actros",4,36000,4);
        mercedes.isWeightRight();
        System.out.println(mercedes.toString());


        System.out.println("----------------------------\n"+"Вывод работы с классом гражданских самолетов:");
        Air civilPlaneCharacteristics = new Air(44.84 , 450);
        Civil civilPlane = new Civil(960," Airbus A300",88,236000,345,true);
        civilPlane.isCountOfPassengersPlaceEnough();
        System.out.println(civilPlane.toString());


        System.out.println("----------------------------\n"+"Вывод работы с классом военных самолетов:");
        Air militaryPlaneCharacteristics = new Air(10.2 , 347);
        Military militaryPlane = new Military(495," Миг-3",3,1350,3,true);
        militaryPlane.shot();
        militaryPlane.ejection();
        System.out.println(militaryPlane.toString());
    }
}
