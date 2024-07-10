import java.util.Scanner;

public class RearrangeArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size
        int n = sc.nextInt();

        // Initialize array
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rearrange using selection sort variation
        for (int i = 0; i < n / 2; i++) {
            int minIndex = i;
            int maxIndex = n - i - 1;

            // Find minimum element in the unsorted part
            for (int j = i + 1; j < n - i; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Find maximum element in the unsorted part
            for (int j = n - i - 2; j > i; j--) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap elements
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            if (i != maxIndex) { // Swap only if indices are different
                temp = arr[n - i - 1];
                arr[n - i - 1] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }

        // Reverse the last three elements (adjust based on your actual number)
        int start = n - 3; // Assuming you want to reverse the last 3 elements
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Print rearranged elements
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println(); // Print newline after elements

        sc.close();
    }
}
