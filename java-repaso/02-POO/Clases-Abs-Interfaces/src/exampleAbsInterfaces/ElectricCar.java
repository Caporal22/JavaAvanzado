package exampleAbsInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDriving{
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, Color color, VehicleStatus status, int batteryCapacity) {
        super(brand, model, year, color, status);
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar drive");
    }

    @Override
    public void chargeBattery() {
        batteryCapacity = MAX_BATTERY_CAPACITY;
        System.out.println("The batery is 100% charged");
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Autopilot is activated");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                '}' + super.toString();
    }
}
