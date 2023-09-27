class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass (Animal)
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " (a " + breed + " dog) is barking.");
    }

    // Override the eat method from the superclass
    @Override
    void eat() {
        super.eat(); // Call the eat method of the superclass (Animal)
        System.out.println(name + " (a " + breed + " dog) is eating bones.");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        myDog.bark(); // Calls the bark method of Dog
        myDog.eat();  // Calls the overridden eat method in Dog, which also calls the superclass Animal's eat method using super
    }
}
