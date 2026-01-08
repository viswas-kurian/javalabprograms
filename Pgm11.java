import java.util.Scanner;

class Calculator {
    double a, b;

    // Read numbers
    public void read(double x, double y) {
        a = x;
        b = y;
    }

    // Addition
    public double add() {
        return a + b;
    }

    // Subtraction
    public double subtract() {
        return a - b;
    }

    // Multiplication
    public double multiply() {
        return a * b;
    }

    // Division
    public double divide() {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}

public class Pgm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        c.read(n1, n2);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Addition = " + c.add());
                    break;

                case 2:
                    System.out.println("Subtraction = " + c.subtract());
                    break;

                case 3:
                    System.out.println("Multiplication = " + c.multiply());
                    break;

                case 4:
                    System.out.println("Division = " + c.divide());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
