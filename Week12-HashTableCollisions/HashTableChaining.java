public class HashTableChaining<K, V> {
    private Entry[] entries;

    public HashTableChaining(int size) {
        entries = (Entry[]) new Object[size];
    }

    public void insert(K key, V value) {
        if (entries[hash(key)] != null) {
            // it means there's something in there already
            // collision

            // now we add it to the linked list

            Entry entry = new Entry();
            entry.key = key;
            entry.value = value;

            // entries[hash(key)] is equivalent to "top" or "head"
            // from our old singly linked stack/list code
            entry.next = entries[hash(key)];
            entries[hash(key)] = entry;
        } else {
            // no collision
            Entry entry = new Entry();
            entry.key = key;
            entry.value = value;
            entries[hash(key)] = entry;

        }
    }

    public V search(K key) {
        return null;
//        if (key.equals(keys[hash(key)])) {
//            return values[hash(key)];
//        } else {
//            int index = hash(key);
//            while (!key.equals(keys[index%keys.length])) {
//                index++;
//                // we could end up in an infinite loop
//                // if we don't find what we're looking for
//            }
//            return values[index];
//        }
    }

    public void remove(K key) {
//        keys[hash(key)] = null;
//        values[hash(key)] = null;
    }

    private int hash(K key) {
        // fast
        // uniform distribution

        //int hashVal = key.toString().charAt(0);
        // this gives values 65 through 122

        int hashVal = key.toString().charAt(0) + key.toString().charAt(1);
        // this gives values from 65 through 244

        return hashVal % entries.length;



    }

    class Entry {
        K key;
        V value;
        Entry next;
    }

    public static void main(String[] args) {
        //Map<String, String> dictionary = new Map<>();
        HashTableChaining<String, String> dictionary = new HashTableChaining<>(100);
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
