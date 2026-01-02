package com.devtalles.estructuradedatos.mapexamples;

import java.util.Map;
import java.util.TreeMap;

public class ExampleStudentRankingTreeMap {

    public static void main(String[] args) {

        Map<Integer, String> studentRanking = new TreeMap<>();

        // Create
        studentRanking.put(85, "Carlos");
        studentRanking.put(95, "Ana");
        studentRanking.put(70, "Luis");
        studentRanking.put(90, "Maria");

        // Read (ordered automatically)
        System.out.println("Student ranking: " + studentRanking);

        // Get specific score
        System.out.println("Student with score 95: " + studentRanking.get(95));

        // Delete
        studentRanking.remove(70);
        System.out.println("Ranking after removal: " + studentRanking);
    }
}
