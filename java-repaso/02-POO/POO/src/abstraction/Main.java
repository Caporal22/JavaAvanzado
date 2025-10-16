package abstraction;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);
//        vehicle.setYear(2000);
//        System.out.println(vehicle.toString());
//

        Vehicle car = new Car("Toyota", "Corolla",2015, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "X456", 2022, false);

        ((Car)car).start();
        ((Motorcycle)motorcycle).start();

        printVehicle(car);
        printVehicle(motorcycle);

        ((Car)car).setDoors(5);

        System.out.println(car);

    }

    public static void printVehicle(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }
}
