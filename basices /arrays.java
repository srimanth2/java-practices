public class arrays {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Looping through the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Modifying an array element
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);
        // Array length
        System.out.println("Length of the array: " + numbers.length);
        // Multidimensional array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // Accessing elements in a multidimensional array
        System.out.println("Element at (1, 2): " + matrix[1][2]); // Output: 6
        // Looping through a multidimensional array
        System.out.println("All elements in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Array of strings
        String[] fruits = { "Apple", "Banana", "Cherry" };
        // Accessing string array elements
        System.out.println("First fruit: " + fruits[0]);
        // Looping through the string array
        System.out.println("All fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        // Modifying a string array element
        fruits[1] = "Blueberry";
        System.out.println("Modified second fruit: " + fruits[1]);
        // Array of characters
        char[] letters = { 'A', 'B', 'C', 'D' };
        // Accessing character array elements
        System.out.println("First letter: " + letters[0]);
        // Looping through the character array
        System.out.println("All letters:");
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        System.out.println(letters);
    }
}
