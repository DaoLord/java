public class trying {
    // method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(string[] args) {
        calculator calculator = new calculator();

        // using the add method with integers
        int sum1 = calculator.add(5, 3); // calls the first add method (int version)
        system.out.println("sum of integers: " + sum1); // output: sum of integers: 8

        // using the add method with doubles
        double sum2 = calculator.add(7.5, 2.5); // calls the second add method (double version)
        system.out.println("sum of doubles: " + sum2); // output: sum of doubles: 10.0
    }
}
