public class exception2{
  public static void main(String[]args){
    int a=10;
    int b=0;
    try{
        int c=a/b;
        System.out.println("result" +c);
    }
    catch(ArithmeticException e){
      System.out.println("Error: Divide by 0 is not possible ");
    }
  }
}
