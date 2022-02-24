public class ArrayStackTester {
    public static void main(String[] args) {



        try {
            Stack<Integer> numStack = new ArrayStack<>(80);

            // System.out.println(numStack.peek());

            System.out.println("Initial stack contents: " + numStack);

            for (int i = 1; i < 6; i++) {
                numStack.push(i);
            }

            System.out.println(numStack.peek());

            System.out.println("Contents of stack: " + numStack);
            //numStack.push(6);
            for (int i = 1; i < 7; i++) {
                //System.out.println("Peeking item at top (that's about to be removed): " + numStack.peek());
                //numStack.pop();

                System.out.println("Removing item: " + numStack.pop());

                //int topThing = numStack.pop();
            }
        } catch (UnsupportedOperationException e) {
            //e.printStackTrace();
        }


//        while(!numStack.isEmpty()) {
//            System.out.println("Removing item: " + numStack.pop());
//        }

//        System.out.println("Contents of stack: " + numStack);
    }
}
