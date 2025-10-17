package finalProyect;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Fiat", "Duna", 2023, CarType.SEDAN);
        Vehicle myElectricCar = new ElectricCar("Tesla", "Model 3", 2019, CarType.SPORTS, 95);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar) myCar).chargeBattery();
        System.out.println("myElectricCar = " + myElectricCar);
        System.out.println("myCar = " + myCar);
    }
}
