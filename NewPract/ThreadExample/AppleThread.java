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
//first create class that extends thread
//then create method run() with statements
//then create main class with main method
//then created new object from class
//then create new thread with Thread(class name)
//then run as A.run();
