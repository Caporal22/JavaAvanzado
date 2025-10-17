package finalProyect;

public class Car extends Vehicle{
    private CarType carType;

    @Override
    public void start() {
        System.out.println("Car started");
    }

    public Car(String brand, String model, int year, CarType carType) {
        super(brand, model, year);
        this.carType = carType;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo: " + carType;
    }
}
