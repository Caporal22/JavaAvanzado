package staticBlock;

public class BlockExample {
    static {
        System.out.println("Bloque estático ejecutando ...");
    }

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
