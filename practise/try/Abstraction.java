
// Abstract class representing a general shape
abstract class Shape {
    // Abstract method for calculating area (no implementation here)
    abstract double calculateArea();
}

// Concrete subclass representing a specific shape (Rectangle)
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

// Concrete subclass representing a specific shape (Circle)
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 3.0);
        Shape circle = new Circle(2.5);

        // Calculate and print the areas of different shapes
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
