class A{
    int a;
  void msg1(int a){
    
    this.a=a;
  }
}
class B extends A{ 
    void msg2(){
  System.out.println("Value of a is "+a);
}
}
public class singleInheritance{
  public static void main(String[] args){
    B obj = new B();
    obj.msg1(100);
    obj.msg2();
  }
} 