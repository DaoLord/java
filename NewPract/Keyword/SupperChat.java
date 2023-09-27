class Parent {
    int x = 10;

    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child class");
    }

    void show() {
        System.out.println("Value of x in Child: " + x);
        System.out.println("Value of x in Parent: " + super.x);
        super.display(); // Calls the display method of the parent class
    }
}
