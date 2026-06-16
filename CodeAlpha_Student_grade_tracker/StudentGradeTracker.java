import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("===== STUDENT GRADE TRACKER =====");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, marks));

            total += marks;

            if (marks > highest)
                highest = marks;

            if (marks < lowest)
                lowest = marks;
        }

        double average = total / n;

        System.out.println("\n========== REPORT ==========");

        System.out.printf("%-20s %-10s\n", "Student Name", "Marks");

        for (Student s : students) {
            System.out.printf("%-20s %-10.2f\n", s.name, s.marks);
        }

        System.out.println("\n============================");
        System.out.printf("Average Marks : %.2f\n", average);
        System.out.printf("Highest Marks : %.2f\n", highest);
        System.out.printf("Lowest Marks  : %.2f\n", lowest);

        System.out.println("\nProgram Completed Successfully!");

        sc.close();
    }
}