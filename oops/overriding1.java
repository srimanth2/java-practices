package oops;

class animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class dog extends animal {
    void sound() {
        super.sound(); // Calls the method from the parent class
        System.out.println("Dog barks");
    }
}

class main {
    public static void main(String[] args) {
        animal obj = new dog();
        obj.sound(); // Output: Dog barks
    }
}