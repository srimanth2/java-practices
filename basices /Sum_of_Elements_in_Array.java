public class Sum_of_Elements_in_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of elements in array: " + sum);
    }
}
