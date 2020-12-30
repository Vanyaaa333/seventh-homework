package Vehicle;

public class Military extends Vehicle {

    int countOfRockets;
    boolean haveEjectionSystem;

    public Military(int maxSpeed, String brand, int weight, int power, int countOfRockets, boolean haveEjectionSystem) {
        super(maxSpeed, brand, weight, power);
        this.countOfRockets = countOfRockets;
        this.haveEjectionSystem = haveEjectionSystem;
    }

    public void shot(){
        if(countOfRockets == 0){
            System.out.println("Боеприпасы отсутствуют.");
        }
        else{
            System.out.println("Ракета пошла...");
        }
    }

    public void ejection(){
        if (haveEjectionSystem){
            System.out.println("Катапультрование прошло успешно");
        }
        else{
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public String toString() {
        return "Гражданский самолет"+super.toString()
                +", Колличество сидячих мест="+countOfRockets
                +", Наличие безнес класса="+haveEjectionSystem
                +", Размах крыльев="+Air.getWingSpan()+"м"
                +", Минимальная длина взлётно-посадочной полосы для взлёта="+Air.getMinLengthOfRunwayStrip()+"м"+"}";
    }
}
