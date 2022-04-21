public class MapTester {
    public static void main(String[] args) {
        //Map<String, String> dictionary = new Map<>();
        HashTableMap<String, String> dictionary = new HashTableMap<>(100);
        dictionary.insert("Hello", "Customary greeting when people meet.");
        dictionary.insert("Hell", "Some place....");
        dictionary.insert("Bye", "Something we say when we leave.");
        dictionary.insert("zoo", "a place where we can see animals");

        //System.out.println(dictionary);

        System.out.println(dictionary.search("Hello"));

    }
}
