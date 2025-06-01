public class loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);
    }

}
// This code demonstrates the use of different types of loops in Java.
// The for loop iterates from 0 to 4, the while loop does the same using a
// different syntax,
// and the do-while loop ensures that the loop body is executed at least once
// before checking the condition.
// The output will show the iteration number for each loop type.
// The for loop is typically used when the number of iterations is known
// beforehand.
// The while loop is used when the number of iterations is not known and depends
// on a condition.
// The do-while loop is similar to the while loop, but it guarantees that the
// loop body will be executed at least once.
