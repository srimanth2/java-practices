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

public class single {
    public static void main(String[] args) {
        b obj = new b();
        obj.display1();
        obj.display();
    }
}
