import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SIS2 {
    public static void main(String[] args) {
        HugeArrayMap<Integer, Student> allStudents = new HugeArrayMap<>();

        Scanner input = new Scanner(System.in);
        while (true) {
            menu();
            int choice = input.nextInt();
            int id;
            switch (choice) {
                case 1:
                    System.out.println("Add student");
                    System.out.println("Enter id:");
                    id = input.nextInt();
                    System.out.println("Enter name:");
                    input.nextLine();
                    String name = input.nextLine();

                    Student student = new Student(name, id);
                    allStudents.insert(id, student);
                    break;
                case 2:
                    System.out.println("Enter id:");
                    id = input.nextInt();

                    if (allStudents.search(id) == null) {
                        System.out.println("Student does not exist.");
                    } else
                        System.out.println("Student info: " + allStudents.search(id));
                    break;
                case 3:
                    System.out.println(allStudents);

                    break;
                default:
                    System.out.println("Wrong input.");
            }
        }
    }

    static void menu() {
        System.out.println("1. Add Student");
        System.out.println("2. Look up student");
        System.out.println("3. Show all students");
    }

}
