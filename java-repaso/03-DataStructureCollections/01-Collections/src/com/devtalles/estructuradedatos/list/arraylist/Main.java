package com.devtalles.estructuradedatos.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        students.add("Daniel");
        students.add("Alejandro");
        students.add("Juan");
        students.add("Javier");
        students.add("Fernando");

        students.add(2, "Joaquin");

        System.out.println(students.get(0));

        System.out.println(students.remove(1));

        System.out.println(students);

        System.out.println(students.set(0, "Danielini"));

        System.out.println(students);
    }
}
