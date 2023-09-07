
class Overriding {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
}

public class Trying extends Overriding {
    // Method overriding: Override the add method in the superclass
    @Override
    public int add(int a, int b) {
        return a + b + 10; // Add 10 to the result
    }

    public static void main(String[] args) {
        Trying calculator = new Trying();

        int sum = calculator.add(7, 3); // Calls the overridden add method
        System.out.println("Sum with overriding: " + sum); // Output: Sum with overriding: 20
    }
}
