
interface A {
    void run();
}

interface B {
    void fun();
}

public class Proto implements A, B {
    public void run() {
        System.out.println("Hello, world");
    }

    public void fun() {
        System.out.println("New world");
    }

    public static void main(String[] args) {
        Proto obj = new Proto();
        obj.run();
        obj.fun();
    }
}
