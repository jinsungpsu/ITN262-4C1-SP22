package com.example.warcardgame;

public class LinkedDemo {
    public static void main(String[] args) {
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('b');
        Node<Character> node3 = new Node<>('c');
        Node<Character> node4 = new Node<>('d');
        Node<Character> node5 = new Node<>('e');

        Node<Character> headNode = node1;

        node1.setNext(node2);
        // headNode.setNext(node2);
        // node2.setNext(node3);
        headNode.getNext().setNext(node3);

        //System.out.println(headNode.getNext());

        System.out.println(headNode);

        // 2 different ways of linking Node B to Node C
        // back to debrief at 11:30AM

    }
}
