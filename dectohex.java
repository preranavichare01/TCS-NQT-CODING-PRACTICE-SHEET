class dectohex {
    public String toHex(int num) {
        // Array of hexadecimal characters
        char[] hexlist = "0123456789abcdef".toCharArray();
        StringBuilder hx = new StringBuilder();

        // Edge case: if num is 0, return "0"
        if (num == 0) {
            return "0";
        }

        // Handle negative numbers by treating the number as an unsigned 32-bit integer
        long n = 0xFFFFFFFFL & num;

        // Convert the number to hexadecimal
        while (n > 0) {
            int res = (int) (n % 16);
            hx.append(hexlist[res]);
            n = n / 16;
        }

        // Reverse the resulting string since the hexadecimal digits were appended in reverse order
        return hx.reverse().toString();
    }

    public static void main(String[] args) {
        dectohex solution = new dectohex();

        // Test cases
        System.out.println(solution.toHex(26));   // Output: "1a"
        System.out.println(solution.toHex(-1));   // Output: "ffffffff"
        System.out.println(solution.toHex(0));    // Output: "0"
        System.out.println(solution.toHex(255));  // Output: "ff"
    }
}
