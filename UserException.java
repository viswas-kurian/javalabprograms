import java.util.Scanner;

// User-defined exception
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class UserException {

    static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            checkAge(age);
        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
