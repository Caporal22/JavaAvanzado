package introduction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/introduction/example.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            while(line != null) {
                System.out.println("line = " + line);
                line = reader.readLine();
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        } catch (IOException e){
            System.out.println("Error reading file");
            throw new RuntimeException(e);
        }
    }
}
