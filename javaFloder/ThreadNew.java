class Apple implements Runnable{
  public void run(){
    System.out.println("runThread");
  } 
}
public class ThreadNew {
  public static void main(String[] args) {
    Apple obj = new Apple();
    Thread t = new Thread(obj);
    t.start();
  }
}
