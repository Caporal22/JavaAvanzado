package staticMethod;

public class MainMath {
    public static void main(String[] args) {

        int result = MathExample.add(10, 20);
        System.out.println("La suma es: " + result);

        MathExample math = new MathExample();
        result = math.substract(80, 40);
        System.out.println("La resta es: "  + result);

    }
}
