import java.io.*;

class Pgm2 {
    public static void main(String[] args) {

        // Check if exactly 3 command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java Pgm2 <num1> <num2> <operation>");
            System.out.println("Operations: 0=add, 1=sub, 2=mul, 3=div, 4=mod");
            return;
        }

        // Convert command-line arguments from string to integer
        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[1]);
        int op3 = Integer.parseInt(args[2]);  // operation code
        int ans;

        // Perform the operation based on the operation code
        switch (op3) {
            case 0: // Addition
                ans = op1 + op2;
                break;
            case 1: // Subtraction
                ans = op1 - op2;
                break;
            case 2: // Multiplication
                ans = op1 * op2;
                break;
            case 3: // Division
                if (op2 == 0) {  // check for division by zero
                    System.out.println("Error: Division by zero");
                    return;
                }
                ans = op1 / op2;
                break;
            case 4: // Modulo
                if (op2 == 0) {  // check for modulo by zero
                    System.out.println("Error: Modulo by zero");
                    return;
                }
                ans = op1 % op2;
                break;
            default:
                // If the operation code is not 0–4
                System.out.println("Invalid operation code.");
                return;
        }

        // Display the final result
        System.out.println("Answer is " + ans);
    }
}
