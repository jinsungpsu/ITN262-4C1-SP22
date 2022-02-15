package com.example.todolistgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.GregorianCalendar;

public class ToDoListController {
    private ArrayToDoList todolist = new ArrayToDoList();

    @FXML
    private ListView<Task> taskList;

    @FXML
    private Button addTaskBtn;

    @FXML
    private Button clearWholeListBtn;

    @FXML
    private TextField newTaskTextField;

    @FXML
    private Button removeTaskBtn;

    @FXML
    public void initialize() {
        // this code runs when the controller is loaded

        // get a bunch of tasks from the CSV
        // add each time into the observable list

        todolist.loadCSV("src/tasks.csv");

        // NEED TO MAKE A CHANGE HERE!
        taskList.setItems(todolist.getTodoObservableList());
    }

    @FXML
    void addTaskBtnClicked(ActionEvent event) {
        addTask();
    }

    private void addTask() {
        String newTask = newTaskTextField.getText();

        if (!newTask.equals("")) {
            todolist.addTask(new Task(newTask));
        }
    }

    @FXML
    void removeTask(ActionEvent event) {

        MultipleSelectionModel<Task> selectedModel = taskList.getSelectionModel();
        Task selectedTask = selectedModel.getSelectedItem();

        // same exact thing as
        //String selectedThing = taskList.getSelectionModel().getSelectedItem();

        //System.out.println(selectedTask);

        todolist.removeTask(selectedTask);

    }

}
