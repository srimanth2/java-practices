package final_static;

class Final_ex {
    public final void display() {
        System.out.println("i am a animal");
    }
}

class dog extends Final_ex {
    public void display() {
        System.out.println("my name is dog");
    }
}

// Main class with the main method
public class main {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.display(); // Calling the final method
    }
}
