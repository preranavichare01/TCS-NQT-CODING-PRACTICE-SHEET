
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
        int n = sc.nextInt();
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.println(n + "is leap year");
        } else {
            System.out.println(n + "is not leap year");
        }
        sc.close();
    }
}
