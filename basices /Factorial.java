import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find Factorial");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = i * sum;
        }
        System.out.println(sum);
        sc.close();
    }

}
