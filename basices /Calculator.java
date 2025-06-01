import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10, b = 5;
        System.out.println("EMTER THE OPERATOR (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        int result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid Operator");
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
