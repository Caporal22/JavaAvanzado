package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiResourcesExample {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("src/com/devtalles/exception/basic/example.txt"));
                BufferedReader reader2 = new BufferedReader(new FileReader("src/com/devtalles/exception/basic/example2.txt"));

        ){

            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("Reader 2: " + reader2.readLine());

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Error reading file");
        }


    }
}
