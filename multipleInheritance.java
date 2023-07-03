class A{
    
  void msg1(){
    System.out.println("Hellow");
    
  }
}
class B extends A{ void msg2(){
  System.out.println("World");
}
}
class C extends B{
    void msg3(){
        System.out.println("New");
    }
}
public class multipleInheritance{
  public static void main(String[] args){
    C obj = new C();
    obj.msg1();
    obj.msg2();
    obj.msg3();
  }
} 