class Apple extends Thread{
 public void run(){
    System.out.println("runThread");
  } 
}
public class ThreadExtend {
  public static void main(String[] args) {
    // Thread t = new Thread();
    Apple t = new Apple();
    t.start();
  }
}
