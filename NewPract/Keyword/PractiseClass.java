interface A{
  void run();
}
interface B{
  void ran();
}
class C implements A,B{
  public void run(){
    System.out.println("output two");
  }
  public void ran(){
    System.out.println("output one");
  }
  void cat(){
    run();
    ran();
  }
}
public class PractiseClass {
  public static void main(String[] args) {
    C obj2 = new C();
    obj2.cat();
    
  }
}
