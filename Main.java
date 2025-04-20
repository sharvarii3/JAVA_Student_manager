// Name: Sharvari Godbole
// PRN: 23070126117
// Batch: AIML B2 2023–2027

import java.util.Scanner;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperations ops = new StudentOperations();
        while (true) {
            long prn = 0;
            String name = "";
            String dob = "";
            double marks = 0.0;
            System.out.println("\n1. Add\n2. Display\n3. Search PRN\n4. Update\n5. Delete\n6. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            try {
                switch (ch) {
                    case 1:
                        System.out.print("Name: ");
                        name = sc.nextLine();
                        System.out.print("PRN: ");
                        prn = sc.nextLong();
                        sc.nextLine();
                        System.out.print("DOB: ");
                        dob = sc.nextLine();
                        System.out.print("Marks: ");
                        marks = sc.nextDouble();
                        ops.addStudent(new Student(name, prn, dob, marks));
                        System.out.println("Student added.");
                        break;
                    case 2:
                        ops.displayStudents();
                        break;
                    case 3:
                        System.out.print("PRN: ");
                        prn = sc.nextLong();
                        System.out.println(ops.searchByPRN(prn));
                        break;
                    case 4:
                        System.out.print("PRN to update: ");
                        prn = sc.nextLong();
                        sc.nextLine();
                        System.out.print("New Name: ");
                        name = sc.nextLine();
                        System.out.print("New DOB: ");
                        dob = sc.nextLine();
                        System.out.print("New Marks: ");
                        marks = sc.nextDouble();
                        ops.updateStudent(prn, name, dob, marks);
                        System.out.println("Updated.");
                        break;
                    case 5:
                        System.out.print("PRN to delete: ");
                        prn = sc.nextLong();
                        ops.deleteStudent(prn);
                        System.out.println("Deleted.");
                        break;
                    case 6:
                        System.out.println("Exiting!");
                        return;
                    default:
                        System.out.println(" ");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
