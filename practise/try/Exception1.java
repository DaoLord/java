
public class Exception1 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch and handle the exception
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
            // Code in the finally block always executes, whether an exception occurred or not
            System.out.println("This block always executes.");
        }
        
        // Code continues here after exception handling
        System.out.println("Program continues after exception handling.");
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw an ArithmeticException if the denominator is zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
