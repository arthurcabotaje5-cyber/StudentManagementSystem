
package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> students = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    students.add(name);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ". " + students.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = input.nextLine();

                    if (students.contains(search)) {
                        System.out.println("Student found!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String delete = input.nextLine();

                    if (students.remove(delete)) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}
