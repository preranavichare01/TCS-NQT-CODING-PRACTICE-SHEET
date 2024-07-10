
//Program to find sum of first n natural numbers

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int res = (n * (n + 1)) / 2;
        System.out.println(res);
        sc.close();
    }
}