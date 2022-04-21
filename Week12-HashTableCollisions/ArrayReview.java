public class ArrayReview {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(arr[1]);

        /*
        7,001,234,567
         */

        Student[] allstudents = new Student[800000000];

        /*
        Student John Smith
        ID: 700123234
         */

        // insert at O(1) time
        allstudents[700123234] = new Student("John", 700123234);


    }
}