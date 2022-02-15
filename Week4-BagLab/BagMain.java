package com.example.todolistgui;

import java.util.List;

public class BagMain {
    public static void main(String[] args) {
        Bag mybag = new ArrayBag();

        mybag.add("cheese");

        mybag.add("money");

        mybag.remove("cheese");

        System.out.println(mybag); // display money
    }
}
