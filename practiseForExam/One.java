interface A{
  void run();
}
interface B{
  void fun();
}
public class One implements A,B{
  pubic static void run(){
    System.out.println("hellow world");
  }
  pubic static void fun(){
    System.out.println("new world");
  }
  public static void main(String[] args) {
    One obj = new One();
    obj.run();
    obj.fun();
  }
}
