class Apple{
   void run(){
  System.out.println("Class PrintOut");
  }
}


public class Demo {
    private String s= "String Output";
  public static void main(String[] args) {
    System.out.println("printOut-1");
    Apple obj1 = new Apple();
    obj1.run();
    Demo obj2 = new Demo();   //to access private varaibles we need to create instance of demo class and access that through it. 
    System.out.println(obj2.s);
  }
}
