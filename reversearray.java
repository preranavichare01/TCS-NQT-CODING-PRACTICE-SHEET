public class reversearray {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        int ans[] = new int[n];
        System.out.println("orginal array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int j = n - 1; j >= 0; j--) {
            ans[n - j - 1] = arr[j];
        }
        System.out.println();
        System.out.println("reversed array:");
        for (int k = 0; k < n; k++) {
            System.out.print(ans[k] + " ");
        }
    }
}
