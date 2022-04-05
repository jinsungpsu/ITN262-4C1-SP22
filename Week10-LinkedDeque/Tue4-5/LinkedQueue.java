public class LinkedQueue<E> implements Queue<E> {
    private Node head, tail;

    @Override
    public void enqueue(E it) throws IllegalStateException {
        Node node = new Node();
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            node.data = it;
            head = node;
        }
    }

    @Override
    public E dequeue() {
        if (tail != null) {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            return temp.data;
        }
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
        Node next, prev;
        E data;
    }
}
