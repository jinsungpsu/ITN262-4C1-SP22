package com.example.todolistgui;

import java.util.ArrayList;

public class ArrayBag implements Bag {
    private ArrayList<String> bagContents = new ArrayList<>();

    @Override
    public void add(String item) {

    }

    @Override
    public void remove(String item) {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public String toString() {
        return "This is a bag!  Its contents are: ....";
    }
}
