public class ObjectHashCodeMap<K, V> {
    private K[] keys;
    private V[] values;

    public ObjectHashCodeMap(int size) {
        keys = (K[]) (new Object[size]);
        values = (V[]) (new Object[size]);
    }

    public void insert(K key, V value) {
        keys[key.hashCode()%keys.length] = key;
        values[key.hashCode()%keys.length] = value;
    }
}
