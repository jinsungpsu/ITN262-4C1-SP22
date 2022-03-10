package com.example.warcardgame;

public class LinkedStackDemo {
    public static void main(String[] args) {
        Stack<Character> mystack = new LinkedStack<>();

        System.out.println(mystack.pop());

        mystack.push('D');
        System.out.println("Peek: " + mystack.peek());
        mystack.push('C');
        System.out.println("Peek: " + mystack.peek());
        mystack.push('B');
        System.out.println(mystack.pop()); // print B
        System.out.println("Peek: " + mystack.peek()); // print C
        mystack.push('A');
        System.out.println("Peek: " + mystack.peek());

        System.out.println(mystack);
        System.out.println(mystack);

    }
}
