import java.util.Scanner;

public class octaltodec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int n = sc.nextInt();
        sc.close();

        // Initialize decimal result
        int decimal = 0;
        int pos = 0;

        // Process each digit of the octal number
        while (n > 0) {
            int digit = n % 10; // Get the rightmost digit
            decimal += digit * Math.pow(8, pos); // Update decimal sum using Math.pow
            pos++; // Increment position for the next power of 8
            n = n / 10; // Move to the next digit
        }

        // Output the decimal equivalent
        System.out.println("Decimal equivalent: " + decimal);
    }
}
