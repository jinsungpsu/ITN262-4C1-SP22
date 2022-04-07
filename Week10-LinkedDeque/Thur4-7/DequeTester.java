package com.example.dequeadt;

public class DequeTester {
    public static void main(String[] args) {
        Deque<String> d = new DoublyLinkedDeque<>();
        d.offerFirst("Hello"); // F  "hello"  B
        d.offerFirst("World"); // F  "World" "hello"  B
        d.offerFirst("123");   // F  "123"   "World" "hello"  B
        System.out.println(d.pollFirst()); // print "123" and remove it
        System.out.println(d.pollFirst()); // print "World" and remove it
        System.out.println(d.pollFirst()); // print "Hello" and remove it
        System.out.println(d.pollFirst()); // print "null" because the deque is empty


    }
}
