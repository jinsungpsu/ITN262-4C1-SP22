public class AirportSimulation {
    public static void main(String[] args) {
        Queue<Airplane> runway1 = new ArrayQueue<>();
        Queue<Airplane> runway2 = new ArrayQueue<>();

        loadRunways3(runway1, runway2);

        simulateAlternatingRunways(runway1, runway2);
    }

    static void loadRunways1(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        runway1.enqueue(new Airplane("AA", 1));
        runway2.enqueue(new Airplane("US", 2));
    }

    static void loadRunways2(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        runway1.enqueue(new Airplane("AA", 1));
        runway1.enqueue(new Airplane("US", 2));
    }

    static void loadRunways3(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        runway2.enqueue(new Airplane("AA", 1));
        runway2.enqueue(new Airplane("US", 2));
    }

    static void simulateAlternatingRunways(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        // write a bunch of logic here... so that this works correctly
        // no matter what is stored in runway 1 and 2

        // use a loop
        // take advantage of the various public methods in Queue interface
        // length...

    }
}
