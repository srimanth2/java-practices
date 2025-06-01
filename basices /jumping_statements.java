public class jumping_statements {
    public static void main(String[] args) {
        // break statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // exit the loop when i is 5
            }
            System.out.println("Break statement iteration: " + i);
        }

        // continue statement
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue; // skip the iteration when j is 5
            }
            System.out.println("Continue statement iteration: " + j);
        }

        // return statement
        System.out.println("Return statement example:");
        printMessage();
    }

    public static void printMessage() {
        System.out.println("This message is printed before returning.");
        return; // exit the method
    }
}
