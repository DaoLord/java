// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Grandchild class inheriting from Dog
class Labrador extends Dog {
    void play() {
        System.out.println("Labrador is playing");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Labrador myLabrador = new Labrador();

        // Calling methods from different levels of inheritance
        myLabrador.eat();  // Method from Animal class
        myLabrador.bark(); // Method from Dog class
        myLabrador.play(); // Method from Labrador class
    }
}
