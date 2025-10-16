package inmutabilidad;

public class Main {
    public static void main(String[] args) {
        House house = new House(2,3,10.2);
        System.out.println("house.getDoors() : " + house.getDoors());
    }
}
