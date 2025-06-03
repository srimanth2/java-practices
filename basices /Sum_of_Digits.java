public class Sum_of_Digits {
    public static void main(String[] args) {
        int m = 2381;
        int sum = 0;
        while (m > 0) {
            int n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
