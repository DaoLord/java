public class Number {
    public static void main(String[] args) {
        String str = "abc123"; // This is not a valid numeric string

        int number;

        try {
            number = Integer.parseInt(str); // Attempting to parse a non-numeric string
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
