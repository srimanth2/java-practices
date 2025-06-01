package oops.inherantences;

class a {
    void display() {
        System.out.println("This is class A");
    }
}

class b extends a {
    void display1() {
        System.out.println("This is class B");
    }
}

class c extends b {
    void display2() {
        System.out.println("This is class C");
    }
}

public class multi_level {
    public static void main(String[] args) {
        c obj = new c();
        obj.display1();
        obj.display2();
        obj.display();
    }
}
// In this example, class C inherits from class B, which in turn inherits from
// class A.
// This is an example of multi-level inheritance in Java.
// The class C can access the methods of class B and class