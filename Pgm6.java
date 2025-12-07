import java.util.Scanner;

class Pgm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix size
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];
        int mul[][] = new int[r][c];

        // Read matrix A
        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        // Read matrix B
        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        // Matrix Addition
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];

        // Matrix Multiplication (only if c == r)
        if (c == r) {
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    for (int k = 0; k < c; k++)
                        mul[i][j] += a[i][k] * b[k][j];
        }

        // Print Sum Matrix
        System.out.println("\nSum of Matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }

        // Print Product Matrix
        if (c == r) {
            System.out.println("\nProduct of Matrices:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++)
                    System.out.print(mul[i][j] + " ");
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix multiplication not possible (columns of A must equal rows of B).");
        }

        sc.close();
    }
}
