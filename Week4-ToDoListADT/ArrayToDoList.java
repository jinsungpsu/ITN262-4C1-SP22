package com.example.todolistgui;

/*
ITN 262 - Programming 3
Starter Code for Assignment 1
 */
// this file will contain all the data/operations
// related to the To Do List

/*
In this assignment, you will design and implement your own to do list application.  You will implement a custom class for a to do list with some public methods such as:
void addTask(String task)
this method will add a task to the to do list
duplicates are allowed, so no need to check
void removeTask(String task)
this method will remove a task (if it exists) to the to do list
if there are duplicates in this list, only remove ONE instance of the task
if the task does not exist, this method should throw an exception
String toString()
this method should return a String with all the tasks that are in the to do list
void clearAllTasks()
this method should clear out all the tasks in the to do list
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ArrayToDoList implements ToDoList{ // assumed to be extends Object
    private String title;
    //private ArrayList<Task> taskList = new ArrayList<>();
    private ObservableList<Task> todoObservableList = FXCollections.observableArrayList();
    // Constructors
    public ArrayToDoList() {
        System.out.println("A to do list object has been created!");
    }

    public ArrayToDoList(String title) {
        this.title = title;
    }

    // setters/getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*
        this method will add a task to the to do list
        duplicates are allowed, so no need to check
         */
    public void addTask(Task task) {
        // basically same function as a setter
        todoObservableList.add(task);
    }

    public void removeTask(Task task) {
        todoObservableList.remove(task);
    }

    public void clearAllTasks() {
        todoObservableList.clear();
    }

    public ObservableList<Task> getTodoObservableList() {
        return todoObservableList;
    }

    @Override
    public String toString() {
        String output = "==============\n";
        output += title + "\n";

        for (int i = 0; i < todoObservableList.size(); i++) {
            output += todoObservableList.get(i) + "\n";
        }

        output += "==============";

        return output;
    }

    public void loadCSV(String filename) {
        try {
            Reader reader = new FileReader(filename);
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
    }
}
