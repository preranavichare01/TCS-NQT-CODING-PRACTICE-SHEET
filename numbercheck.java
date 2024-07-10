import java.util.Scanner;

public class numbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("positive number");
        }
        if (n < 0) {
            System.out.println("negative number");
        }
        if (n == 0) {
            System.out.println("zero");
        }
        if (n % 2 == 0) {
            System.out.println("even number");
        }
        if (n % 2 != 0) {
            System.out.println("odd number");
        }
        sc.close();
    }
}