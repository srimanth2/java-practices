package oops.Polymorphism;

class overloding {
    void add(int a1, int a2) {
        System.out.println(a1 + a2);
    }

    void add(double a1, double a2) {
        System.out.println(a1 + a2);
    }
}

class main {
    public static void main(String[] args) {
        overloding obj = new overloding();
        obj.add(20, 50);
        obj.add(23.5, 50.5);
    }
}

// Method Overloading in Java
// Method overloading is a feature that allows a class to have more than one
// method with the same name,
// but different parameters. This is useful when you want to perform similar
// operations with different types of data.
// For example, you can have a method that adds two integers and another method
// that adds two doubles.
// In this example, we will create a class called "overloding" that has two
// methods called "add".
// The first method takes two integers as parameters and the second method takes
// two doubles as parameters.
// The main method will create an object of the "overloding" class and call both
// methods to demonstrate method overloading.
