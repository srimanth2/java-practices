import java.util.Arrays;

public class Array_min_max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 283476, 19, 20 };
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
