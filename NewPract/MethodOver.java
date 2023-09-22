public class MethodOver {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        MethodOver example = new MethodOver();

        // Call the overloaded methods
        int result1 = example.add(5, 10);
        String result2 = example.add("Hello, ", "World!");

        // Display the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
