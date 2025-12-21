package com.devtalles.estructuradedatos.iteradores;

import java.util.ListIterator;

public class NameService {

    private final NameRepository repository;

    public NameService(NameRepository repository) {
        this.repository = repository;
    }

    public void addAfter(String referenceName, String newName) {
        ListIterator<String> iterator = repository.getNames().listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(referenceName)) {
                iterator.add(newName);
                break;
            }
        }
    }

    public void update(String oldName, String newName) {
        ListIterator<String> iterator = repository.getNames().listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(oldName)) {
                iterator.set(newName);
                break;
            }
        }
    }

    public void remove(String nameToRemove) {
        ListIterator<String> iterator = repository.getNames().listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(nameToRemove)) {
                iterator.remove();
                break;
            }
        }
    }

    public void printAll() {
        ListIterator<String> iterator = repository.getNames().listIterator();

        System.out.println("\nCurrent names:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}
