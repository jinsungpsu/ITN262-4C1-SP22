public class HugeArrayMap<K, V> {
    private final int DEFAULT_CAPACITY = 800000000;

    private int[] keys; // not really needed
    private V[] values = (V[])new Object[DEFAULT_CAPACITY];

    public void insert(int key, V value) {
        values[key] = value;
    }

    public V search(int key) {
        return values[key];
    }

    public void remove(int key) {
        values[key] = null;
    }

}
