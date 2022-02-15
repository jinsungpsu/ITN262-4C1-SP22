package com.example.todolistgui;

public interface Bag {
    /*
    @returns nothing
    @params item is thing to be added to bag
     */
    public void add(String item);

    /*
    @params item is the thing to remove
     */
    public void remove(String item);

    /*

     */
    public void removeAll();
}
