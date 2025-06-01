import java.util.Scanner;

class conditional_statements_example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to check it is positive or negitive: ");
        int number = scanner.nextInt();
        if ((number < 0)) {
            System.out.println("The number is negative");
        } else if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is zero");
        }
        scanner.close();
    }
}
