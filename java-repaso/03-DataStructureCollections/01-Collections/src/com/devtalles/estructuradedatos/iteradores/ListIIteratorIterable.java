package com.devtalles.estructuradedatos.iteradores;

import java.util.*;

public class ListIIteratorIterable {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Daniel", "Alfredo", "Victor"));
        System.out.println("names = " + names);

        // Agregar nombre
        addName(names, "Armando");

        // Mostrar nombres
        readNames(names);

        // Actualizar nombre
        updateName(names,"Ana", "Victor"  );

        // Eliminar nombre
        removeName(names, "Alfredo");

        System.out.println("names = " + names);

    }

    public static void addName(List<String>names, String newName) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if(name.equals("Daniel")) {
                iterator.add(newName);
                break;
            }
        }

        System.out.println(names);
    }

    public static void updateName(List<String>names, String newName, String oldName) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals(oldName)) {
                iterator.set(newName);
                break;
            }
        }

        System.out.println(names);
    }

    public static void removeName(List<String>names, String nameToRemove) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals(nameToRemove)) {
                iterator.remove();
                break;
            }
        }

        System.out.println(names);
    }

    public static void readNames(List<String>names) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
            }
        System.out.println();
    }

}
