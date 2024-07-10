class dectooct {
    public String toOctal(int num) {
        // Array of octal characters
        char[] octlist = "01234567".toCharArray();
        StringBuilder oct = new StringBuilder();

        // Edge case: if num is 0, return "0"
        if (num == 0) {
            return "0";
        }

        // Handle negative numbers by treating the number as an unsigned 32-bit integer
        long n = 0xFFFFFFFFL & num;

        // Convert the number to octal
        while (n > 0) {
            int res = (int) (n % 8);
            oct.append(octlist[res]);
            n = n / 8;
        }

        // Reverse the resulting string since the octal digits were appended in reverse
        // order
        return oct.reverse().toString();
    }

    public static void main(String[] args) {
        dectooct solution = new dectooct();

        // Test cases
        System.out.println(solution.toOctal(26)); // Output: "32"
        System.out.println(solution.toOctal(-1)); // Output: "37777777777" (representing -1 in octal)
        System.out.println(solution.toOctal(0)); // Output: "0"
        System.out.println(solution.toOctal(255)); // Output: "377"
    }
}
