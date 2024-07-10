import java.util.Scanner;

class bintodec {
    public int todecimal(int num) {
        // Edge case: if num is 0, return 0
        if (num == 0) {
            return 0;
        }

        int decimal = 0;
        int position = 0;

        // Process each digit of the binary number
        while (num > 0) {
            int digit = num % 10; // Get the rightmost digit
            decimal += digit * Math.pow(2, position); // Update decimal sum using Math.pow
            num = num / 10; // Move to the next digit
            position++; // Increment position for the next power of 2
        }

        return decimal;
    }

    public static void main(String[] args) {
        bintodec solution = new bintodec();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int m = sc.nextInt();
        sc.close();

        // Convert binary number to decimal
        int decimalResult = solution.todecimal(m);

        System.out.println("Decimal equivalent: " + decimalResult);
    }
}
