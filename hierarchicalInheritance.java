class A{
    
  void msg1(){
    System.out.println("Head");
    
  }
}
class B extends A{ void msg2(){
  System.out.println("Right");
}
}
class C extends A{
    void msg3(){
        System.out.println("Left");
    }
}
public class hierarchicalInheritance{
  public static void main(String[] args){
    B obj = new B();
    obj.msg1();
    obj.msg2();
    C obj2 = new C();
    obj2.msg1();
    obj2.msg3();
    
  }
} 