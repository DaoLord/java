public class ThreadLifecycleDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        System.out.println("Thread state after creation: " + thread.getState());
        
        thread.start();
        System.out.println("Thread state after starting: " + thread.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after sleeping: " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after joining: " + thread.getState());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
        for (int i = 0; i < 5; i++) {
            System.out.println("Counter: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

