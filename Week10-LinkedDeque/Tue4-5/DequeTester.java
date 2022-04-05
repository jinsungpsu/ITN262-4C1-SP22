public class DequeTester {
    public static void main(String[] args) {
        Deque<String> myWords = new LinkedDeque<>();

        myWords.offerFirst("Hello");
        myWords.offerLast("World");

        
    }
}
