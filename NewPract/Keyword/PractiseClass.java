interface A{
  void run(){
    System.out.println("output one");
  }
}
interface B{
  void ran(){
    System.out.println("output two");
  }
}
class C implements A,B{
  void cat(){
    A obj = new A();
    obj.run();
    obj.ran();

  }
}
public class PractiseClass {
  public static void main(String[] args) {
    C obj2 = new C();
    obj2.cat();
    
  }
}
