
public class WrapperExample {
    public static void main(String[] args) {
        // Creating instances of wrapper classes
        Integer intWrapper = Integer.valueOf(42); // Wraps an int
        Double doubleWrapper = Double.valueOf(3.14); // Wraps a double
        Boolean booleanWrapper = Boolean.valueOf(true); // Wraps a boolean
        Character charWrapper = Character.valueOf('A'); // Wraps a char

        // Auto-boxing (Java automatically wraps the primitive)
        Integer anotherIntWrapper = 99;

        // Unboxing (Extracting the primitive value from the wrapper)
        int primitiveInt = intWrapper.intValue();
        double primitiveDouble = doubleWrapper.doubleValue();
        boolean primitiveBoolean = booleanWrapper.booleanValue();
        char primitiveChar = charWrapper.charValue();

        // Using wrapper classes in collections
        java.util.ArrayList<Integer> intList = new java.util.ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // Wrapper classes can also be used with null values
        Integer nullableInt = null;
    }
}
