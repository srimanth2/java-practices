class conditional_statements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // if statement
        if (a < b) {
            System.out.println("a is less than b");
        }

        // if-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // nested if statement
        if (a < b) {
            System.out.println("a is less than b");
            if (b > 15) {
                System.out.println("b is greater than 15");
            }
        }
    }
}
// The above code demonstrates the use of conditional statements in Java.
// The if statement is used to execute a block of code if a condition is true.
// The if-else statement is used to execute one block of code if a condition is
// true and another block of code if it is false.
// The nested if statement is used to check multiple conditions.
// The program uses the main method to execute the code.
// The program is a simple demonstration of the use of conditional statements in
// Java.