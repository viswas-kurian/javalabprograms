import java.io.*;

class Pgm1 {
    public static void main(String args[]) {

	// Check if exactly 2 command-line arguments are provided
        if(args.length != 2) {
            System.out.println("Usage: java Pgm1 <num1> <num2>");
            return;
        }

        // Convert command-line arguments from string to integer
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum=a+b;  //sum of command-line arguments

        // display  command-line arguments
        System.out.print("Sum of "+ a +" and " + b + " is "+ sum);
    }
}
