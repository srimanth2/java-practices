public class search {
    public static void main(String[] args) {
        String str = "Hello, World!";
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'w') {
                System.out.println("Character found at index: " + i);
            }
        }

    }
}