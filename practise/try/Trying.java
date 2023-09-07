
public class Trying {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using the add method with integers
        int sum1 = calculator.add(5, 3); // Calls the first add method (int version)
        System.out.println("Sum of integers: " + sum1); // Output: Sum of integers: 8

        // Using the add method with doubles
        double sum2 = calculator.add(7.5, 2.5); // Calls the second add method (double version)
        System.out.println("Sum of doubles: " + sum2); // Output: Sum of doubles: 10.0
    }
}
