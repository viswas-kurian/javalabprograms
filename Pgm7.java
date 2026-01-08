import java.util.Scanner;

public class Pgm7 {

    // Function to return maximum of two numbers
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Function to return maximum of three numbers using max(a, b)
    public static int maxOfThree(int a, int b, int c) {
        int maxAB = max(a, b);
        return max(maxAB, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int maximum = maxOfThree(num1, num2, num3);

        System.out.println("Maximum = " + maximum);

        sc.close();
    }
}
