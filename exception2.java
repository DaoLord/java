public class exception2{
  public static void main(String[]args){
    try{
        int a=100/0; 
        System.out.println("result" +a);
    }
    catch(ArithmeticException e){
      System.out.println("Error: Divide by 0 is not possible "+System.lineSeparator() +e);
    }
  }
}
