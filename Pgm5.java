/**
 * Program 5: Implement a Java program to pass an array in different ways.
 * Demonstrates:
 * 1. Passing entire array to a method
 * 2. Passing array elements individually
 * 3. Modifying array inside a method
 * 4. Passing array and returning a value (sum)
 */

import java.util.Scanner;

public class Pgm5 {

    // Method 1: Display entire array
    public static void displayArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method 2: Modify array elements
    public static void modifyArray(int[] arr) {
        System.out.println("\nModifying array elements (multiplying by 2)...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    // Method 3: Display individual element
    public static void displayElement(int element, int index) {
        System.out.println("Element at index " + index + ": " + element);
    }

    // Method 4: Sum of array elements
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n=== Passing Array in Different Ways ===\n");

        // 1. Entire array
        System.out.println("1. Displaying entire array:");
        displayArray(numbers);

        // 2. Individual elements
        System.out.println("\n2. Displaying individual elements:");
        for (int i = 0; i < numbers.length; i++) {
            displayElement(numbers[i], i);
        }

        // 3. Passing array to return sum
        System.out.println("\n3. Sum of array elements:");
        int sum = calculateSum(numbers);
        System.out.println("Sum = " + sum);

        // 4. Modifying array through method
        System.out.println("\n4. Modifying array (pass by reference demo):");
        
        System.out.println("Before modification:");
        displayArray(numbers);

        modifyArray(numbers);

        System.out.println("After modification:");
        displayArray(numbers);

        sc.close();
    }
}
