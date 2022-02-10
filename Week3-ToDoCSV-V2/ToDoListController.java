package com.example.todolistgui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ToDoListController {
    private ObservableList<Task> todoObservableList = FXCollections.observableArrayList();

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

        try {
            Reader reader = new FileReader("src/tasks.csv");
            BufferedReader br = new BufferedReader(reader);
            String csvHeader = br.readLine();
            String taskInfo = br.readLine();
            while (taskInfo != null) { // means I am not at the end of the file
                System.out.println(taskInfo);

                String[] taskDetails = taskInfo.split(",");
                // if the taskInfo string is "ITN262 Assignment 3, 100, 02/14/2022, false"
                // the split method will break it up into parts
                // taskDetails[0] = "ITN262 Assignment 3"
                // taskDetails[1] = " 100"
                // taskDetails[2] = " 02/14/2022"
                // taskDetails[3] = " false"

                Task tempTask = new Task();
                tempTask.setTaskName(taskDetails[0].trim());
                tempTask.setPriority(Integer.parseInt(taskDetails[1].trim()));
                tempTask.setCompleted(Boolean.parseBoolean(taskDetails[3].trim()));

                // how to parse the Date data from the CSV
                String[] dateDetails = taskDetails[2].trim().split("/");

                int yr = Integer.parseInt(dateDetails[2]);
                int month = Integer.parseInt(dateDetails[0]);
                int day = Integer.parseInt(dateDetails[1]);
                GregorianCalendar tempDate = new GregorianCalendar(yr, month, day); // need year, month, date

                tempTask.setDueDate(tempDate);


                // create a new task object
                // add it to the observable list
                todoObservableList.add(tempTask);

                taskInfo = br.readLine(); // this one goes to the next line of the CSV
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open the CSV");
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
        taskList.setItems(todoObservableList);
    }

    @FXML
    void addTaskBtnClicked(ActionEvent event) {
        addTask();
    }

    private void addTask() {
        String newTask = newTaskTextField.getText();

        if (!newTask.equals("")) {
            //todoObservableList.add(newTask);
        }
    }

    @FXML
    void removeTask(ActionEvent event) {

        //MultipleSelectionModel<String> selectedModel = taskList.getSelectionModel();
        //String selectedTask = selectedModel.getSelectedItem();

        // same exact thing as
        // String selectedThing = taskList.getSelectionModel().getSelectedItem();

        //System.out.println(selectedTask);

        //todoObservableList.remove(selectedTask);

    }

}
