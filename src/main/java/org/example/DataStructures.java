package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", TaskItem.taskStatus.TO_DO),
                new TaskItem(2,"Prepare for the quiz", TaskItem.taskStatus.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", TaskItem.taskStatus.COMPLETED));
    }

    public List<TaskItem> getTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(TaskItem.taskStatus status){
        return tasks
                .stream()
                .filter(task -> {
                    return task.taskStatus.equals(status);
                }).toList();
    }

    public List<TaskItem> getbyId(){
        return tasks
                .stream()
                .filter(task -> {
                    return task.taskId>=2;
                }).toList();
    }

    public void getDescription(){
        tasks
                .stream()
                .forEach(task -> {
                    System.out.println(task.taskDescription);
                });

    }
}

