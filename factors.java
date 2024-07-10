
//Find all factors of a Natural Number in sorted order

import java.util.ArrayList;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                li.add(i);
            }
        }
        for (int j : li) {
            System.out.println(j);
        }
        sc.close();
    }

}
