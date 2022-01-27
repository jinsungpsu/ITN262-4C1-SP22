/*
ITN 262 - Programming 3
Starter Code for Assignment 1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList itn262assignments = new ToDoList();
        ToDoList itn263assignments = new ToDoList();

//        itn262assignments.addTask("To Do List App hw");
//        itn262assignments.addTask("Stacks HW");
//        itn262assignments.addTask("Read module 1");
//        itn262assignments.addTask("Study for exam");

        Scanner keyboard = new Scanner(System.in);

        String task;

        System.out.println("Enter task name:");
        task = keyboard.nextLine();

        itn262assignments.addTask(task);


    }
}