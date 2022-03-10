package com.example.warcardgame;

public class LinkedStack<T> implements Stack<T> {
    private Node<T> head;

    @Override
    public void push(T item) throws UnsupportedOperationException {
        Node<T> tempNode = new Node<>(item);

        if (isEmpty()) {
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
        if(isEmpty()) {
            return null;
        } else {

            // temporarily save the head node
            Node<T> temp = head;

            // make the "new" head... point to the current head's next node
            head = head.next;
        /*
        Node secondNode = head.next;
        head = secondNode;
         */

            // delete (garbage collection will happen when there's nothing to do here...)

            return temp.data;
        }
    }

    @Override
    public T peek() {
        return head.getData();
    }

    @Override
    public boolean isEmpty() {
        /*
        if (head == null) {
            return true;
        } else {
            return false;
        }
         */
        return (head == null);
    }

    @Override
    public int length() {
        // SUPER EASY, 1 LINER... SACRIFICE SMALL MEMORY TO GAIN RUNTIME EFFICIENCY


        // LOOKS A LOT LIKE THE TOSTRING METHOD... SLOW, BUT NO EXTRA MEMORY NEEDED
        return 0;
    }

    @Override
    public String toString() {
        String o = "Stack contents: ";

        Node<T> itr = head;
        while(itr != null) {
            o += itr.data + " ";
            itr = itr.next;
        }

        return o;
    }


    // nested Node class
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
