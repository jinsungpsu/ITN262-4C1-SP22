public class ArrayQueue<E> implements Queue<E> {
    private final int DEFAULT_CAPACITY = 5;
    private E[] queue;
    private int count;
    private int front, back;

    public ArrayQueue() {
        queue = (E[]) new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    public ArrayQueue(int size) {
        queue = (E[]) new Object[size];
        count = 0;
    }

    @Override
    public void enqueue(E it) throws IllegalStateException {
        // option 1 is runtime complexity O(1)
        // 0 is the "front" of the queue

        if (count < queue.length) {
            // i need to do some magic, so that i don't go out of bounds
            back = back - queue.length;


            queue[count++] = it;
        }



        // option 2 - is runtime complexity O(n)
//        if (count < queue.length) {
//            for (int i = count; i > 0; i--) {
//                queue[i] = queue[i-1];
//            }
//            count--;
//        }

    }

    @Override
    public E dequeue() {
        //option 1 is O(1)
        E returnData = queue[front];
        front++;
        count--;
        return returnData;

        /*
        option 2 is O(N)

        E returnData = queue[0];
        for (int i = 0; i < count-1; i++) {
            queue[i] = queue[i+1];
        }

         */
    }

    @Override
    public E frontValue() {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }
}
