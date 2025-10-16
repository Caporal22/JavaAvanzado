package abstraction;

public class Car extends Vehicle{
    private int doors;
    private Engine engine;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
        this.engine = new Engine();
    }

    public void start() {
        System.out.println("The cas is starting");
        engine.start();
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                "} -- " + super.toString();
    }
}
