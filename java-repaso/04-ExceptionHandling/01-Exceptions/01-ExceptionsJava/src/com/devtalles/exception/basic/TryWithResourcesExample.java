package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/devtalles/exception/basic/example.txt"));){

            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Error reading file");
        }


    }
}
