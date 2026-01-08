import java.util.Scanner;

class Complex {
    int real, imag;

    // Read complex number
    public void read(int r, int i) {
        real = r;
        imag = i;
    }

    // Display complex number
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    // Add two complex numbers
    public Complex add(Complex c2) {
        Complex temp = new Complex();
        temp.real = this.real + c2.real;
        temp.imag = this.imag + c2.imag;
        return temp;
    }

    // Multiply two complex numbers
    public Complex multiply(Complex c2) {
        Complex temp = new Complex();
        temp.real = (this.real * c2.real) - (this.imag * c2.imag);
        temp.imag = (this.real * c2.imag) + (this.imag * c2.real);
        return temp;
    }
}

public class Pgm12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();

        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();

        c1.read(r1, i1);
        c2.read(r2, i2);

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);

        System.out.print("\nFirst Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Product: ");
        product.display();

        sc.close();
    }
}
