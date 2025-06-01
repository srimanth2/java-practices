import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt(), i, count = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("not a prime number");
        } else {
            System.out.println("prime number");
        }
        sc.close();
    }

}
