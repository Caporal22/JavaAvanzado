package com.devtalles.estructuradedatos.iteradores;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        NameRepository repository = new NameRepository(
                Arrays.asList("Daniel", "Alfredo", "Victor")
        );

        NameService service = new NameService(repository);

        service.printAll();
        service.addAfter("Daniel", "Armando");
        service.update("Victor", "Ana");
        service.remove("Alfredo");

        System.out.println("\nFinal state:");
        service.printAll();
    }
}
