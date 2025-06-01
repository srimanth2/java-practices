public class sumarr {
    public static void main(String[] args) {
        int[] arr = { 1, 10000, 3, 4, 5, 6, 6, 6, 5, 5, 4, 4, 3, 2, 2 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of array is " + sum);
    }
}
