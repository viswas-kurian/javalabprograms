import java.util.Scanner;

public class RethrowFinally {

    static void divide(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught in method");
            throw e; // re-throwing exception
        }
        finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            divide(x, y);
        }
        catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
