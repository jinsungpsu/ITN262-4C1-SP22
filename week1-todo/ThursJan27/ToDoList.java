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

import java.util.ArrayList;

public class ToDoList { // assumed to be extends Object
    private String title;
    private ArrayList<String> taskList = new ArrayList<>();

    // Constructors
    public ToDoList() {
        System.out.println("A to do list object has been created!");
    }

    public ToDoList(String title) {
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
    public void addTask(String task) {
        // basically same function as a setter
        taskList.add(task);
    }

    @Override
    public String toString() {
        String output = "==============\n";
        output += title + "\n";

        for (int i = 0; i < taskList.size(); i++) {
            output += taskList.get(i) + "\n";
        }

        output += "==============";

        return output;
    }
}
