public class QueueTester {

    public static void main(String[] args) {
        Queue<Character> myQ = new ArrayQueue<>();
        myQ.enqueue('Z'); // front      Z      back
        myQ.enqueue('O'); // front      Z O      back
        myQ.enqueue('A'); // front      Z O A     back
        System.out.println(myQ);
        myQ.enqueue('C'); // front      Z O A C     back
        System.out.println(myQ.dequeue()); // Z
        // front      O A C     back
        System.out.println(myQ.dequeue()); // O
        // front      A C     back
        System.out.println(myQ);
        myQ.enqueue('X'); // front      A C X     back
        myQ.enqueue('Y'); // front      A C X Y    back
        System.out.println(myQ);
        myQ.enqueue('F'); // front      A C X Y F    back

        System.out.println(myQ.dequeue());

        myQ.enqueue('B'); // front      C X Y F B    back
        System.out.println(myQ);

    }
}
