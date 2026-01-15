package com.devtalles.proyect.task.view;

import com.devtalles.proyect.task.controller.TaskController;
import com.devtalles.proyect.task.exceptions.TaskException;
import com.devtalles.proyect.task.exceptions.TaskValidationException;
import com.devtalles.proyect.task.model.Task;

import java.util.Scanner;

public class TaskView {
    private final TaskController taskController;
    private final Scanner scanner;


    public TaskView(TaskController taskController) {
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
                    removeTaskView();
                    break;
                case "3":
                    updateTaskView();
                    break;
                case "4":
                    showTaskView();
                    break;
                case "5":
                    System.out.println("Exit...");
                    return;
                    default:
                        System.out.println("Invalid option, try again");
            }

        }
    }

    public void addTaskView(){
        try{
            Task task = getTaskInput();
            taskController.addTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());
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

    public void showTaskView(){
        try {
            System.out.println("\nTask Management System: ");
            this.taskController.showsTasks();
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void updateTaskView() {
        try{
            Task task = getTaskInput();
            taskController.updateTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());
            System.out.println("Task has been update successfully!");
        } catch (TaskValidationException | TaskException e){
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private Task getTaskInput(){
        String id;
        do {
            System.out.println("Enter an id: ");
            id = scanner.nextLine();
            if(id.isEmpty()){
                System.out.println("Invalid id... is empty!");
            }
        } while (id.isEmpty());

        String title;
        do {
            System.out.println("Enter title:");
            title = scanner.nextLine();
            if(title.isEmpty()){
                System.out.println("Invalid title... is empty!");
            }
        } while (title.isEmpty());


        String description;
        do {
            System.out.println("Enter description:");
            description = scanner.nextLine();
            if(description.isEmpty()){
                System.out.println("Invalid description... is empty!");
            }
        } while (description.isEmpty());

        Boolean completed = null;
        while(completed == null){
            System.out.println("Enter completed:");
            String input = scanner.nextLine().trim().toLowerCase();
            if(input.equals("true")){
                completed = true;
            }else if(input.equals("false")){
                completed = false;
            } else {
                System.out.println("Invalid input... is empty! (true/false)");
            }
        }

        return new Task(id, title, description, completed);
    }

}
