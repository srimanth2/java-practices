public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

}

class x extends helloWorld {
    public static void main(String[] args) {
        helloWorld hw = new helloWorld();
        hw.main(args);
    }
}