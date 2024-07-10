import java.util.Arrays;

public class smallele {
    public static void main(String[] args) {
        int arr1[] = { 2, 5, 1, 3, 60 };
        int arr2[] = { 8, 10, 5, 7, 9 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        int k = 0;
        System.out.println(arr1[k]);

        Arrays.sort(arr2);

        System.out.print(arr2[k]);

    }
}