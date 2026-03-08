package com.devtalles.proyect.task.controller;

import com.devtalles.proyect.task.exceptions.TaskException;
import com.devtalles.proyect.task.exceptions.TaskValidationException;
import com.devtalles.proyect.task.model.Task;
import com.devtalles.proyect.task.model.TaskRepository;

import java.util.List;

public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(String id, String title, String description, Boolean completed) throws TaskValidationException, TaskException {
        validateTaskDate(id, title, description, completed);
        Task task = new Task(id, title, description, completed);
        this.taskRepository.save(task);
        System.out.println("Task added");
    }

    public void removeTask(String id) throws TaskValidationException, TaskException {
        if(id==null || id.trim().isEmpty()){
            throw new TaskValidationException("Task id cannot be empty");
        }
            this.taskRepository.remove(id);
    }

    public void showTasks() throws TaskValidationException, TaskException {
        List<Task> tasks = this.taskRepository.findAll();
        if (tasks.isEmpty()) {
            throw new TaskValidationException("List cannot be empty");
        }
        for(Task task : tasks){
            System.out.println(task);
        }
//        List<Task> tasks = this.taskRepository.findAll();
    }

    public void showCompletedTasks() throws TaskValidationException, TaskException {
        List<Task> completedTasks = this.taskRepository.findCompletedTasks();
        for(Task task : completedTasks){
            System.out.println(task);
        }
//        List<Task> tasks = this.taskRepository.findAll();
    }

    public void showPendingTasks() throws TaskValidationException, TaskException {
        List<Task> pendingTasks = this.taskRepository.findPendingTasks();
        for(Task task : pendingTasks){
            System.out.println(task);
        }
//        List<Task> tasks = this.taskRepository.findAll();
    }

    public void updateTask(String id, String title, String description, Boolean completed) throws TaskValidationException, TaskException {
        validateTaskDate(id, title, description, completed);
        Task updateTask = new Task(id, title, description, completed);
        this.taskRepository.updateTask(updateTask);

    }

    public void updateTaskComplete(String id, Boolean completed) throws TaskValidationException, TaskException {
        validateTaskDate(id, completed);
        this.taskRepository.updateTaskCompleted(id, completed);

    }

    private void validateTaskDate(String id, String title, String description, Boolean completed) throws TaskValidationException {
        if(id==null || id.trim().isEmpty()){
        throw new TaskValidationException("Task id cannot be empty");
        }

        if(title==null || title.trim().isEmpty()){
            throw new TaskValidationException("Task title cannot be empty");
        }

        if(description==null || description.trim().isEmpty()){
            throw new TaskValidationException("Task description cannot be empty");
        }

       if(completed==null ){
            throw new TaskValidationException("Task completed cannot be empty");
        }

    }

    private void validateTaskDate(String id, Boolean completed) throws TaskValidationException {
        if(id==null || id.trim().isEmpty()){
            throw new TaskValidationException("Task id cannot be empty");
        }

        if(completed==null ){
            throw new TaskValidationException("Task completed cannot be empty");
        }
    }

}
