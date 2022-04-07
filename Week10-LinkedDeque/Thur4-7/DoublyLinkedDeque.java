package com.example.dequeadt;

public class DoublyLinkedDeque<E> implements Deque<E> {
    private Node front, back;
    private int count;

    @Override
    public boolean offerFirst(E item) {
        // add item at front of deque

        Node node = new Node(item);

        if (front == null) {
            // meaning the deque is empty
            front = back = node;
        } else {
            node.next = front;
            front.prev = node;
            front = node;
        }

        count++;

        return true;
        // theoretically, you won't need to return false (meaning can't add item to the deque), because we are using a linked list
    }

    @Override
    public boolean offerLast(E item) {
        return false;
    }

    @Override
    public E pollFirst() {
        // remove and return FRONT of deque
        if (front == null) {
            // if empty
            return null;
        } else if (count == 1) {
            // special case when there's only 1 item left
            Node temp = front;
            front = back = null;
            count--;
            return temp.data;

        } else {
            // general case
            Node temp = front;
            Node second = front.next;
            front.next = null;
            second.prev = null;

            front = second;
            // the new front is now the second item
            // it orphans the former front item... so deletes

            count--;
            return temp.data;
        }

    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    class Node {
        Node next, prev;
        E data;

        public Node(E data) {
            this.data = data;
        }
    }
}
