import java.util.*;

class Pgm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read search element
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        // Sorting - Bubble Sort
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for(int x : arr) System.out.print(x + " ");
        System.out.println();

        // Searching - Linear Search
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == search) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found");
        }
    }
}
