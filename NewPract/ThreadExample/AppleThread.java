class MyThread extends Thread{
  public void run(){
    System.out.println("running");
  }
}
public class AppleThread {
  public static void main(String[] args) {
    MyThread Apple = new MyThread();
    Thread A = new Thread(Apple);
    A.run();

  }
}
