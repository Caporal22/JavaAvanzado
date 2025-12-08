package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        try {
            readFile("src/introuction/example2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe en el sistema");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fin");
    }

    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println("El archivo fue abierto con éxito");
        reader.close();
    }
}
