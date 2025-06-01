import java.util.Scanner;

public class amstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int temp = number;
        int length = String.valueOf(number).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, length);
            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println("it is an Armstrong number");
        } else {
            System.out.println("it is not an Armstrong number");
        }
    }
}