import java.util.Scanner;

public class Pgm8 {

    // Function to return reverse of a number
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    // Function to check palindrome using reverse() function
    public static boolean isPalindrome(int n) {
        int rev = reverse(n);
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = reverse(num);
        System.out.println("Reversed number = " + rev);

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is Not a Palindrome");
        }

        sc.close();
    }
}
