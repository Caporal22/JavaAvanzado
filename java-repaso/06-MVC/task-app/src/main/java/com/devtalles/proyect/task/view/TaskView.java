package com.devtalles.proyect.task.view;

import com.devtalles.proyect.task.controller.TaskController;
import com.devtalles.proyect.task.exceptions.TaskException;
import com.devtalles.proyect.task.exceptions.TaskValidationException;

import java.util.Scanner;

public class TaskView {
    private final TaskController taskController;
    private final Scanner scanner;


    public TaskView(TaskController taskController, Scanner scanner) {
        this.taskController = taskController;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu(){
        while(true){
            System.out.println("\n Task Management System");
            System.out.println("1. Create Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Update Task");
            System.out.println("4. Show Tasks");
            System.out.println("5. Exit");
            System.out.println("Select an option");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    addTaskView();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
            }

        }
    }

    public void addTaskView(){

        try{
            System.out.println("Enter an id: ");
            String id = scanner.nextLine();

            System.out.println("Enter title:");
            String title = scanner.nextLine();

            System.out.println("Enter description:");
            String description = scanner.nextLine();

            System.out.println("Is the task complete? true/false");
            Boolean completed = Boolean.parseBoolean(scanner.nextLine());
            taskController.addTask(id, title, description, completed);
            System.out.println("Task has been added successfully!");
        } catch (TaskValidationException | TaskException e){
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void removeTaskView() {
        try {
            System.out.println("Enter an id to remove: ");
            String id = scanner.nextLine();
            this.taskController.removeTask(id);
            System.out.println("Task has been removed successfully!");
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
