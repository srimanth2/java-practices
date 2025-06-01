public class revers {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int n = 65271;

        // Reverse string
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        // Reverse integer digits
        // int original = n;
        int reversedInt = 0;
        while (n != 0) {
            int digit = n % 10;
            reversedInt = reversedInt * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed integer: " + reversedInt);
        System.out.println("Reversed string: " + reversedStr);
    }
}
