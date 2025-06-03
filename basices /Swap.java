public class Swap {
    public static void main(String[] args) {
        int a = 10000;
        int b = 102;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}