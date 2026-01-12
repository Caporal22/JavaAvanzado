package com.devtalles.proyect.task.model;

import com.devtalles.proyect.task.exceptions.TaskException;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    List<Task> tasks = new ArrayList<Task>();

    public void save(Task task) throws TaskException {
        if(task==null){
            throw new TaskException("Task is null");
        }
        tasks.add(task);
    }

    public Task findById(String id){
        for (Task task : tasks){
            if(task.getId().equals(id)){
                return task;
            }
        }
        return null;
    }

    public void remove(String id) throws TaskException {
        Task task = findById(id);
        if(task==null){
            throw new TaskException("Task is null");
        }
        tasks.remove(task);
    }

    public void remove(Task task) throws TaskException {
//        Task task = findById(id);
        if(task==null){
            throw new TaskException("Task is null");
        }
        if(!tasks.contains(task)) {
            throw new TaskException("Task does not exist");
        }
        tasks.remove(task);
    }

    public List<Task> findAll() throws TaskException {
        if(tasks.isEmpty()){
            throw new TaskException("Tasks is empty");
        }
        return tasks;
    }

    public int findIndexById(String id){
        for (int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public void updateTask(Task updateTask) throws TaskException {
        if(updateTask==null){
            throw new TaskException("Task is null");
        }
        int index = findIndexById(updateTask.getId());
        if (index == -10) {
            throw new TaskException("Task does not exist");
        }
        tasks.set(index, updateTask);
    }

}
