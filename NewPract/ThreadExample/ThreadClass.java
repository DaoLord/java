public class ThreadClass {
    public static void main(String[] args) {
        // Create a new thread by extending the Thread class
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();

        // Main thread continues to execute concurrently with MyThread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Define a custom thread by extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
