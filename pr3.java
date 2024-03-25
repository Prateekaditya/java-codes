import java.util.Scanner;


public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student(rollNo, name, cgpa);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }

        Student studentWithLowestCGPA = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < studentWithLowestCGPA.cgpa) {
                studentWithLowestCGPA = students[i];
            }
        }

        System.out.println("Student with lowest CGPA:");
        studentWithLowestCGPA.displayDetails();
    }
}
