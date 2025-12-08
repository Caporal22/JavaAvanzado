package com.devtalles.exception.errorsimulation;

public class ErrorSimulation {
    public static void main(String[] args) {

        try{
            simulatorError();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error details: " + e.getLocalizedMessage());
            e.printStackTrace(System.out);
        }

    }

    public static void simulatorError() {
        causeError();
    }

    public static void causeError() {
        throw new RuntimeException("Critic error in the app");
    }

}
