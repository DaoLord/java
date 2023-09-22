public class Null {
    public static void main(String[] args) {
        String str = null;

        // Attempting to access the length of a null string
        int length = str.length(); // This will throw a NullPointerException
    }
}
