public class ArrayStack<T> implements Stack<T> {
    private final int DEFAULT_SIZE = 5; // this is pretty arbitrary!
    private T[] stack;
    private int count;

    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void push(T item) throws UnsupportedOperationException {
        // stack[] = item;
        // this is what it looked like when we used arraylist: stack.add(item);

        stack[count] = item;
        count++;
    }

    @Override
    public T pop() {

        count--;
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
}
