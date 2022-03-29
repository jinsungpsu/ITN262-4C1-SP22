public class LinkedQueue<E> implements Queue<E> {
    private Node head;

    @Override
    public void enqueue(E it) throws IllegalStateException {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E frontValue() {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }

    class Node {
        Node next;
        E data;
    }
}
