package com.example.todolistgui;

/*
Task Name, Priority, Due Date, Completed
ITN262 Assignment 3, 100, 02/14/2022, false
Sleep, 100, 02/08/2022, false
Sleep, 100, 02/07/2022, true
Eat, 90, 02/08/2022, false
 */

import java.util.Date;

public class Task {
    private String taskName;
    private int priority;
    private Date dueDate;
    private boolean completed;

    public Task() {

    }

    public Task(String taskName, int priority, Date dueDate, boolean completed) {
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", priority=" + priority +
                ", dueDate=" + dueDate +
                ", completed=" + completed +
                '}';
    }
}
