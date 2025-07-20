import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {
    static double result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.println("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    performAddition(scanner);
                } else if (choice == 2) {
                    performSubtraction(scanner);
                } else if (choice == 3) {
                    performMultiplication(scanner);

                } else if (choice == 4) {
                    performDivision(scanner);
                } else if (choice == 0) {
                    System.out.println("EXITING!");
                    running = false;
                } else {
                    System.out.println("Invalid option");
                }
            } catch (InputMismatchException e) {
                System.out.println("please enter a valid number");
                scanner.next();
            }
        }
        scanner.close();


    }

    public static void displayMenu() {
        System.out.println("--- Scientific Calculator ---");
        System.out.println("1. Add +");
        System.out.println("2. Subtract -");
        System.out.println("3. Multiply *");
        System.out.println("4. Divide /");
        System.out.println("5. Square Root x^2");
        System.out.println("6. Power (x^y)");
        System.out.println("7. Sine (sin x)");
        System.out.println("8. Cosine (cos x)");
        System.out.println("9. Tangent (tan x)");
        System.out.println("10. Natural Log (ln x)");
        System.out.println("11. Log Base 10 (log₁₀ x)");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round");
        System.out.println("14. Ceil");
        System.out.println("15. Floor");
        System.out.println("16. Minimum");
        System.out.println("17. Maximum");
        System.out.println("0. Exit");


    }

    public static void performAddition(Scanner scanner) {
        System.out.println("perform addition");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void performSubtraction(Scanner scanner) {
        System.out.println("perform subtraction");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public static void performMultiplication(Scanner scanner) {
        System.out.println("perform multiplication");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public static double performDivision(Scanner scanner) {
        System.out.println("perform division");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Undefined");
            return Double.NaN;
        }
        result = num1 / num2;
        System.out.println("Result: " + result);
        return result;

    }
}
