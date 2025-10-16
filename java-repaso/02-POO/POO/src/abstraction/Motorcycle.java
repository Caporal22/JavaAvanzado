package abstraction;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;
    private Engine engine;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = true;
        this.engine = new Engine();
    }

    public void popWheelie(){
        System.out.println("Popping Wheelie");
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public void start() {
        System.out.println("The motorcycle is starting");
        engine.start();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                "} -- " +  super.toString();
    }
}
