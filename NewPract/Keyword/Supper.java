class A{
  void run(){
    System.out.println("Main Parent class");
  }
}
class B extends A{
  void run(){
    super.run();
    System.out.println("Child class runner");
  }
}
public class Supper {
  public static void main(String[] args) {
    B obj = new B();
    obj.run();
  }
}
