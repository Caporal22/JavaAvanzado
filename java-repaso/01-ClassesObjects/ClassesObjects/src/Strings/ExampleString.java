package Strings;

public class ExampleString {
    public static void main(String[] args) {
        String name = "Daniel";
        String name2 = "Alejandro";

        System.out.println(name == name2);

        System.out.println(name.toUpperCase());
        System.out.println(name);

        Person person = new Person("Daniel", "Sanchez");

        System.out.println(person.toString());
    }
}
