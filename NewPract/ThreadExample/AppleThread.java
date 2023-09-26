class Apple extends Thread{
  public void run(){
    System.out.println("running");
  }
}
public class AppleThread {
  public static void main(String[] args) {
    Apple Apple = new Apple();
    Thread A = new Thread(Apple);
    A.run();

  }
}
