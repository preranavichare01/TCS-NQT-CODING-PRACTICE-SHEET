import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int k = 1; // start from index 1 as the first element is always unique
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[j - 1]) {
                arr[k] = arr[j];
                k++;
            }
        }
        // Print only the unique elements
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
