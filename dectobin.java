//convert decimal to binary
import java.util.Scanner;

class dectobin {
    public String tobinary(int num) {
        // Array of hexadecimal characters

        StringBuilder hx = new StringBuilder();

        // Edge case: if num is 0, return "0"
        if (num == 0) {
            return "0";
        }

        // Handle negative numbers by treating the number as an unsigned 32-bit integer
        long n = 0xFFFFFFFFL & num;

        // Convert the number to hexadecimal
        while (n > 0) {
            int res = (int) (n % 2);
            hx.append(res);
            n = n / 2;
        }

        // Reverse the resulting string since the hexadecimal digits were appended in
        // reverse order
        return hx.reverse().toString();
    }

    public static void main(String[] args) {
        dectobin solution = new dectobin();

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(solution.tobinary(m));
        sc.close();
    }
}
