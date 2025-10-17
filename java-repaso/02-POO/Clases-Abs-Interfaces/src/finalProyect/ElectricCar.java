package finalProyect;

public class ElectricCar extends Car implements Electric {
    private int battery;

    public ElectricCar(String brand, String model, int year, CarType carType, int battery) {
        super(brand, model, year, carType);
        this.battery = battery;
    }

    @Override
    public void start() {
        System.out.println("ElectricCar start");
    }


    @Override
    public void chargeBattery() {
        battery = 100;
        System.out.println("ElectricCar chargeBattery");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "battery=" + battery +
                '}' + " --" + super.toString();
    }
}
