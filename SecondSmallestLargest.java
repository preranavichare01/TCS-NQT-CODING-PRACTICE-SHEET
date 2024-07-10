import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallestLargest {

    public static int findSecondSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                return arr[i];
            }
        }
        return -1;  // In case all elements are the same
    }

    public static int findSecondLargest(int[] arr) {
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }
        return -1;  // In case all elements are the same
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Second smallest element: -1");
            System.out.println("Second largest element: -1");
        } else {
            Arrays.sort(arr);
            int secondSmallest = findSecondSmallest(arr);
            int secondLargest = findSecondLargest(arr);
            System.out.println("Second smallest element: " + secondSmallest);
            System.out.println("Second largest element: " + secondLargest);
        }

        sc.close();
    }
}
