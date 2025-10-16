package exampleAbsInterfaces;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private Color color;
    private VehicleStatus status;

    public Vehicle(String brand, String model, int year, Color color, VehicleStatus status) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.status = status;
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void stop(){
        System.out.println("Vehicle stopped");
    }

    public abstract void drive();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.LocalDate.now().getYear();
        if(year < 1986 || year > currentYear + 2){
            throw new IllegalArgumentException("Year out of range");
        }
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color=" + color +
                ", status=" + status +
                '}';
    }
}
