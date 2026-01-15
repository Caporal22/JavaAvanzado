package com.devtalles.proyect;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person = Person.builder().name("Daniel").age(24).lastName("Sanchez").build();
        System.out.println(person);
//        person.setName("Daniel");
//        person.setAge(24);

    }
}