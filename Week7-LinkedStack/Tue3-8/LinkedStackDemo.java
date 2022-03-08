package com.example.warcardgame;

public class LinkedStackDemo {
    public static void main(String[] args) {
        Stack<Character> mystack = new LinkedStack<>();

        mystack.push('D');
        mystack.push('C');
        mystack.push('B');
        mystack.push('A');

        System.out.println(mystack);

    }
}
