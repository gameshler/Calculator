import java.util.Scanner;

public class CalculatorProject {
    public static void main(String[] args) {

        System.out.println("Welcome to the Basic Calculator!");
        System.out.println(
                "This program accepts two numbers and performs addition, subtraction, multiplication, or division.");

        try (Scanner scanner = new Scanner(System.in)) {
            // Accepting two numbers from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Ensuring the numbers are within an acceptable range (example: -10^6 to 10^6)
            if (num1 > 1_000_000 || num1 < -1_000_000 || num2 > 1_000_000 || num2 < -1_000_000) {
                System.out.println("Error: Numbers must be in the range [-1,000,000, 1,000,000].");
                return;
            }

            // Displaying operation choices
            System.out.println("Choose an operation:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            // Perform the chosen operation
            double result;
            switch (choice) {
                case 1 -> {
                    result = num1 + num2;
                    System.out.println("Result (Addition): " + result);
                }
                case 2 -> {
                    result = num1 - num2;
                    System.out.println("Result (Subtraction): " + result);
                }
                case 3 -> {
                    result = num1 * num2;
                    System.out.println("Result (Multiplication): " + result);
                }
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        // Casting result for rounding
                        result = (int) (num1 / num2 + 0.5); // Rounds to nearest integer
                        System.out.println("Result (Division): " + result);
                    }
                }
                default -> System.out.println("Error: Invalid choice. Please select between 1 and 4.");
            }
        } catch (Exception e) {
            // Handle invalid input (non-numeric values)
            System.out.println("Error: Invalid input. Please enter numbers only.");
        }
    }
}
