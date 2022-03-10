package com.example.warcardgame;

public class ArrayStack<T> {
    private T[] stack;

    public ArrayStack() {
        stack = (T[]) new Object[100];
    }
}
