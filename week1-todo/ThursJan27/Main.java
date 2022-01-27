/*
ITN 262 - Programming 3
Starter Code for Assignment 1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDoList itn262assignments = new ToDoList();
        itn262assignments.setTitle("Programming 3 To Do List");
        ToDoList itn263assignments = new ToDoList("Mobile App Dev To Do List");

//        itn262assignments.addTask("To Do List App hw");
//        itn262assignments.addTask("Stacks HW");
//        itn262assignments.addTask("Read module 1");
//        itn262assignments.addTask("Study for exam");

        Scanner keyboard = new Scanner(System.in);

        int userChoice;
        do {

            mainMenu();
            userChoice = keyboard.nextInt();
            keyboard.nextLine();

            switch(userChoice) {
                case 1:
                    System.out.println("Enter task name:");
                    String task;
                    task = keyboard.nextLine();
                    itn262assignments.addTask(task);
                    break;
                case 2:
                    // remove
                    break;
                case 3:
                    // view list
                    System.out.println(itn262assignments);
                    break;
            }

        } while(userChoice != 5);


    }

    static void mainMenu() {
        System.out.println("1: Add Task");
        System.out.println("2: Remove Task");
        System.out.println("3: View All Tasks");
        System.out.println("5: Exit Program");
        System.out.println("What do you want to do? (Enter number): ");
    }
}