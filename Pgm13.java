import java.util.Scanner;

class CString {
    String str;

    // Read string
    public void read(String s) {
        str = s;
    }

    // Display string
    public void display() {
        System.out.println(str);
    }

    // Compare two CString objects
    public boolean compare(CString c) {
        return str.equals(c.str);
    }

    // Concatenate two CString objects
    public String add(CString c) {
        return str + c.str;
    }
}

public class Pgm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CString c1 = new CString();
        CString c2 = new CString();

        System.out.print("Enter first string: ");
        c1.read(sc.nextLine());

        System.out.print("Enter second string: ");
        c2.read(sc.nextLine());

        System.out.print("\nFirst string: ");
        c1.display();

        System.out.print("Second string: ");
        c2.display();

        System.out.println("\nAre both strings equal? " + c1.compare(c2));
        System.out.println("Concatenation: " + c1.add(c2));

        sc.close();
    }
}
