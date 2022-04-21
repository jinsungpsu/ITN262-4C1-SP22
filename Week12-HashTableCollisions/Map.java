public class Map<K, V> {
    private final int DEFAULT_CAPACITY = 100;
    private K[] keys = (K[])(new Object[DEFAULT_CAPACITY]);
    private V[] values = (V[])(new Object[DEFAULT_CAPACITY]);

    public void insert(K key, V value) {
        int hashValue = hashFunction(key);

        keys[hashValue] = key;
        values[hashValue] = value;
    }

    private int hashFunction(K key) {
        // something happens
        // where we translate the key to an integer
        // that integer will be a spot in the array

        // kind of tough to do with a generic type
        System.out.println("The key is: " + key);
        int hashVal = key.toString().charAt(0);

        System.out.println("Hash value for this key is: " + hashVal);

        /*
        The range of values that this hash function can produce is
        between 65 (A) to 122 (z)
         */

        return hashVal;
    }

    public void remove(K key) {
        int hashValue = hashFunction(key);

        keys[hashValue] = null;
        values[hashValue] = null;

    }

    public V search(K key) {
        int hashValue = hashFunction(key);

        return values[hashValue];
    }
}
