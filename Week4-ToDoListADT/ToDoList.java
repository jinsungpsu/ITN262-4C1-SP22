package com.example.todolistgui;

import javafx.collections.ObservableList;

public interface ToDoList {
    public void addTask(Task task);

    public void removeTask(Task task);

    public void clearAllTasks();

}
