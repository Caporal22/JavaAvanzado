package com.devtalles.exception.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistrationSystem {

    private List<Student> students;

    public StudentRegistrationSystem() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String name, int age, String id) throws DuplicateStudentException {
        validateStudent(name, age, id);

        if(isStudentRegistered(id)){
            throw new DuplicateStudentException("Student with id " + id + " is already registered");
        }

        this.students.add(new Student(name, age, id));

        System.out.println("Successfully registered student " + name);
    }

    public void removeStudent(String id) throws StudentNotFoundException {
        if(id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Student id cannot be null or empty");
        }

        Iterator<Student> iterator = this.students.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getId().equals(id)){
                iterator.remove();
                System.out.println("Successfully removed student " + id);
                return;
            }
        }
        throw new StudentNotFoundException("Student doesn't exist");
    }

    public boolean isStudentRegistered(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }


    public void validateStudent(String name, int age, String id) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }

        if(age < 17 || age>100) {
            throw new IllegalArgumentException("Student age cannot be less than 17 or higher than 100");
        }

        if(id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Student id cannot be null or empty");
        }

        if(!id.matches("^[A-Z]\\d{5}$")){
            throw new IllegalArgumentException("Student id doesn't match with valid format");
        }

    }

    public static void main(String[] args) {
        StudentRegistrationSystem system = new StudentRegistrationSystem();

        try {
            system.registerStudent("Daniel, Sánchez", 22, "A12345");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            system.registerStudent("Alejandro, Ahumada", 16, "A12345");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            system.registerStudent("Gabriel, Vazquez", 25, "12345");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            system.registerStudent("Gabriel, Fernandez", 25, "A45678");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            system.registerStudent("", 25, "A12345");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            system.removeStudent( "A45678");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }


        try {
            system.removeStudent( "A99999");
        } catch (StudentNotFoundException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }


    }



}
