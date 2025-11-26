package arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       int[] numbersPrimitive = {1, 2, 3, 4, 5, 6, 0, 9};

       int deletePosition = 2;

       for(int i = deletePosition; i < numbersPrimitive.length-1; i++){
           numbersPrimitive[i] = numbersPrimitive[i+1];
       }

       numbersPrimitive[numbersPrimitive.length-1] = 0;

       for(int number : numbersPrimitive ){
           System.out.println(number);
       }




     /*
        numbersPrimitive[0] = 1;
        numbersPrimitive[1] = 10;
        Integer[] numbersWrapper = new Integer[5];

        numbersWrapper[0] = 100;
        numbersWrapper[1] = 200;
        int[] newNumbers = new int[numbersPrimitive.length + 1];
        System.arraycopy(numbersPrimitive, 0, newNumbers, 0, numbersPrimitive.length);
        newNumbers[5] = 500;

        System.out.println("Tipo int: ");

        for(int number: newNumbers){
            System.out.println("number = " + number);
        }

        System.out.println("Tipo Integer: ");

        for(Integer number: numbersWrapper){
            System.out.println("number = " + number);
        } */




    }
}
