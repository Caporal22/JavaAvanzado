package exampleAbsInterfaces;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ford", "Raptor", 2023) {
            @Override
            public void drive() {
                System.out.println("I'm Driving!!!");
            }
        };

        System.out.println(vehicle.toString());

        Vehicle electric = new ElectricCar("Porshe", "Spyder", 2025, Color.RED, VehicleStatus.AVAILABLE, 90);

        System.out.println(electric.toString());

    }
}
