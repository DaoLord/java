class MyThread extends Thread{
  public void run(){
    for(int i=1;i<6;i++){
      System.out.println(i);
    }
  }
}
public class ThreadExtend {
  public static void main(String[] args) {
    MyThread ab = new MyThread();
    Thread a = new Thread(ab);
    // a.start();
    a.run();
  }
}
