package com.example.warcardgame;

public class LinkedStack<T> implements Stack<T> {
    private Node<T> head;

    @Override
    public void push(T item) throws UnsupportedOperationException {
        Node<T> tempNode = new Node<>(item);

        if (head == null) {
            // stack is empty
            head = tempNode;
        } else {
            // stack has at least one item in it
            // we're gonna make the connection

            // this (tempNode) new node's next is the old head
            tempNode.setNext(head);

            // and then this new node (tempNode) becomes the new head
            head = tempNode;
        }
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public String toString() {
        String o = "Stack contents: ";
        return o + head;
    }
}
