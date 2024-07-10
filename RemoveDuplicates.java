
/*import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Using a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        // Converting the set back to an array
        int[] ans = new int[set.size()];
        int index = 0;
        for (int ele : set) {
            ans[index++] = ele;
        }

        // Printing the original array
        System.out.println("Before duplicate removed:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Printing the array after removing duplicates
        System.out.println("After duplicate removed:");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}*/
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int j = 0;

        // Traverse through the given array
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is already in the temp array
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the temp array
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }

        // Copy the unique elements back to the original array (if needed)
        int[] ans = new int[j];
        for (int i = 0; i < j; i++) {
            ans[i] = temp[i];
        }

        // Printing the original array
        System.out.println("Before duplicate removed:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Printing the array after removing duplicates
        System.out.println("After duplicate removed:");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
