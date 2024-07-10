import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float res = 0;
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i1 = n / 2;
        int i2 = (n / 2) - 1;
        if (n % 2 == 0) {
            res = (arr[i1] + arr[i2]) / 2.0f;
        } else {
            res =(int) arr[i1];
        }
        System.err.println("median=" + (res));
    }
}
