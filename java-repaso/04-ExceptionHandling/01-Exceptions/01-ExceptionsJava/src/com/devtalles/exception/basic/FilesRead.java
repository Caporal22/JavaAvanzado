package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesRead {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/introduction/example.txt"));

            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }


//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//            throw new RuntimeException(e);
        }catch (IOException e){
            System.out.println("Error reading file");
        } finally {
            try {
                if(reader != null){
                    reader.close();
                    System.out.println("File closed");
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }

        }


    }
}
