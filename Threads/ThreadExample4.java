public class ThreadExample4 {
    public static void main(String[] args) {
        final String resource1 = "Hero Honda";
        final String resource2 = "INCCES";
        Thread t1= new Thread(){
            public void run(){
                synchronized(resource1){
                    System.out.println("Thread1: locked resource 1");
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                    synchronized(resource2){
                        System.out.println("Thread1: locked resource 2");
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread2: locked resource 2");
                    try{
                        Thread.sleep(100);
                    } catch(Exception e){}
                synchronized (resource1){
                    System.out.println("Thread2: locked resource 2");
                }
            }
        }
    };
    t1.start();
    t2.start();
}
