import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Student Information System Data Entry ---");

        // 1. Input: Get Name
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        // 2. Input: Get Age
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();

        // 3. Input: Get Grade (using nextDouble)
        System.out.print("Enter Student Numerical Grade (e.g., 85.5): ");
        double grade = scanner.nextDouble();

        // Consume the rest of the line to prevent issues with future input (good practice)
        scanner.nextLine();

        // 4. Conditional Logic: Determine Status based on Grade
        String status;
        if (grade >= 90) {
            status = "Excellent";
        } else if (grade >= 75) {
            status = "Good";
        } else if (grade >= 60) {
            status = "Passing";
        } else {
            status = "Needs Improvement";
        }

        System.out.println("\n--- Student Enrollment Details ---");

        // 5. Formatted Output: Display the data neatly
        // %-15s: Left-justifies a String in a 15-character field.
        // %-15d: Left-justifies an Integer in a 15-character field.
        // %-15.2f: Left-justifies a float/double, showing exactly 2 decimal places.

        System.out.printf("%-15s %s\n", "Name:", name);
        System.out.printf("%-15s %d years\n", "Age:", age);
        System.out.printf("%-15s %.2f%%\n", "Grade:", grade); // Shows grade with 2 decimals
        System.out.printf("%-15s %s\n", "Status:", status);

        scanner.close();
    }
}