import java.lang.*;

public class ThreadPract extends Thread{
  public void run(){
    System.out.println("runner");
  }
  public static void main(String[] args) {
    ThreadPract t1 = new ThreadPract();
    ThreadPract t2 = new ThreadPract();
    ThreadPract t3 = new ThreadPract();
    System.out.println("t1 priority" + t1.getPriority());
    System.out.println("t2 priority" + t2.getPriority());
    System.out.println("t3 priority" + t3.getPriority());
    t1.setPriority(10);
    t2.setPriority(4);
    t3.setPriority(1);
    System.out.println("t1 priority" + t1.getPriority());
    System.out.println("t2 priority" + t2.getPriority());
    System.out.println("t3 priority" + t3.getPriority());
    System.out.println("main priority" + currentThread().getPriority());
    Thread.currentThread().setPriority(9);
    System.out.println("main priority" + currentThread().getPriority());
    
  }
  
}
