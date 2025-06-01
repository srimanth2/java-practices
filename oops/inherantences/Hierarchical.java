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

class c extends a {
    void display2() {
        System.out.println("This is class C");
    }
}

class d extends a {

    void display3() {
        System.out.println("This is class d");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        b obj1 = new b();
        obj1.display1();
        obj1.display();
        c obj2 = new c();
        obj2.display2();
        obj2.display();
        d obj3 = new d();
        obj3.display3();
        obj3.display();
    }
}
// // In this example, class B and class
// // C both inherit from class A.
// // This is an example of hierarchical inheritance in Java.
// // The class B and class C can access the methods of class A.
// // The class D can also access the methods of class A.
