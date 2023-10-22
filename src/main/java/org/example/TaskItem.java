package org.example;

public class TaskItem {
    public enum taskStatus{
        TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
    }
    public int taskId;
    public String taskDescription;
    public static taskStatus taskStatus;

    public TaskItem(int id, String description, taskStatus status) {
        this.taskId = id;
        this.taskDescription=description;
        this.taskStatus=status;
    }

}