public class ArrayStack<T> implements Stack<T> {
    private final int DEFAULT_SIZE = 5; // this is pretty arbitrary!
    private T[] stack;
    private int count;

    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_SIZE];
    }

    public ArrayStack(int newSize) {
        stack = (T[]) new Object[newSize];
    }

    @Override
    public void push(T item) throws UnsupportedOperationException {
        // stack[] = item;
        // this is what it looked like when we used arraylist: stack.add(item);

        // can't go beyond the "size" (which is currently 5)
        if (count < stack.length) {
            // it's cool, we have space
            stack[count] = item;
            count++;
        } else {
            // if something goes wrong
            // throw an exception
            // System.out.println("not enough space!  can't add " + item);
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public T pop() {
        // you can't pop from an empty stack
        // we need to put in a check for it
        int topIndex = count - 1;
        count--;
        return stack[topIndex];
    }

    @Override
    public T peek() {
        // you can't pop from an empty stack
        // we need to put in a check for it
        int topIndex = count - 1;
        return stack[topIndex];
    }

    @Override
    public boolean isEmpty() {
        // do something with count
        return false;
    }

    @Override
    public int length() {
        // do something with count
        return 0;
    }

    public String toString() {
        // you'll need to use a loop... currently it only shows the bottom 3 items
        String output = "";

        // do some stuff... build this string to make sense...

        output += stack[0] + " " + stack[1] + " " + stack[2];

        return output;
    }
}
