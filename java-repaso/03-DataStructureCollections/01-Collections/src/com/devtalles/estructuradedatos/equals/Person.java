package com.devtalles.estructuradedatos.equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person)obj;
        return Objects.equals(name, person.name);
//        return super.equals(obj);
    }

    public static void main(String[] args) {
        Person persona1 = new Person("Daniel");
        Person persona2 = new Person("Daniel");
        Person persona3 = new Person("Nancy");

        System.out.println(persona2.equals(persona1));
        System.out.println(persona2.equals(persona3));
    }
}
