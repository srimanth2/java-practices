import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String dub_str = sb.reverse().toString();
        System.out.println("Reversed string: " + dub_str);
        if (str.equalsIgnoreCase(dub_str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
