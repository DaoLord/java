interface A{
  void run();
}

interface B{
  void fun();
}

public class One implements A,B{
  public void run(){
    System.out.println("hellow world");
  }
  public void fun(){
    System.out.println("new brand");
  }

  public static void main(String[] args) {
    One obj = new One();
    obj.run();
    obj.fun();
  }
}
