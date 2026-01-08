import java.util.Scanner;

public class Pgm10 {

    // Recursive function to print numbers from n to 1
    public static void displayDesc(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        displayDesc(n - 1);
    }

    // Recursive function to print numbers from 1 to n
    public static void displayAsc(int n) {
        if (n == 0)
            return;
        displayAsc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Numbers from " + n + " to 1: ");
        displayDesc(n);

        System.out.print("\nNumbers from 1 to " + n + ": ");
        displayAsc(n);

        sc.close();
    }
}
