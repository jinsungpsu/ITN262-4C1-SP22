import java.util.HashMap;

public class HashTableMap<K, V> {
    private K[] keys;
    private V[] values;

    public HashTableMap(int size) {
        keys = (K[]) new Object[size];
        values = (V[]) new Object[size];
    }

    public void insert(K key, V value) {
        keys[hash(key)] = key;
        values[hash(key)] = value;
    }

    public V search(K key) {
        return values[hash(key)];
    }

    public void remove(K key) {
        keys[hash(key)] = null;
        values[hash(key)] = null;
    }

    private int hash(K key) {
        // fast
        // uniform distribution

        //int hashVal = key.toString().charAt(0);
        // this gives values 65 through 122

        int hashVal = key.toString().charAt(0) + key.toString().charAt(1);
        // this gives values from 65 through 244

        return hashVal % keys.length;



    }
}
