import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        if (n >= 1)
            System.out.println(a);
        if (n >= 2)
            System.out.println(b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        sc.close();
    }
}
