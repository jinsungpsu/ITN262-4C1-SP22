public class HashTableProbing<K, V> {
    private K[] keys;
    private V[] values;

    public HashTableProbing(int size) {
        keys = (K[]) new Object[size];
        values = (V[]) new Object[size];
    }

    public void insert(K key, V value) {
        if (keys[hash(key)] != null) {
            // it means there's something in there already
            // collision

            // linear probing... means we check the next spot... and the next.. and the next
            // until we find an open spot

            int index = (hash(key) + 1) % keys.length;
            while (keys[index] != null) {
                index++;
                // there is a potential to end up in an infinite loop here
                // if this loop never finds an open spot
            }

            // once we're done, the index is where we insert
            keys[index] = key;
            values[index] = value;

        } else {
            keys[hash(key)] = key;
            values[hash(key)] = value;
        }
    }

    public V search(K key) {
        if (key.equals(keys[hash(key)])) {
            return values[hash(key)];
        } else {
            int index = hash(key);
            while (!key.equals(keys[index%keys.length])) {
                index++;
                // we could end up in an infinite loop
                // if we don't find what we're looking for
            }
            return values[index];
        }
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

    public static void main(String[] args) {
        //Map<String, String> dictionary = new Map<>();
        HashTableProbing<String, String> dictionary = new HashTableProbing<>(100);
        dictionary.insert("Hello", "Customary greeting when people meet.");
        dictionary.insert("Hell", "Some place....");
        dictionary.insert("He", "male pronoun");
        dictionary.insert("Bye", "Something we say when we leave.");
        dictionary.insert("zoo", "a place where we can see animals");

        //System.out.println(dictionary);

        System.out.println(dictionary.search("Hello"));
        System.out.println(dictionary.search("Hell"));
        System.out.println(dictionary.search("He"));

        System.out.println(dictionary.search("zooooo"));



    }
}
