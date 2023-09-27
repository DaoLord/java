interface A{
  void run();
}
interface B{
  void run();
}
public class Interface implements A, B{
  public void run(){
    System.out.println("apple");
    System.out.println("banana");
  }
  public static void main(String[] args) {
    Interface obj = new Interface();
    obj.run();
  }
}
//first create interface a and b with method void run()only and then class implements a,b with class name being main file name
//and then create run() method and code statement and then run main method with object init and then obj.run() and that's it.
