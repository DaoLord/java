// Create a class that implements the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        // Create an instance of the MyRunnable class
        Runnable myRunnable = new MyRunnable();

        // Create a thread and pass the Runnable instance to it
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // Main thread continues executing
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
