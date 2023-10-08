public class Except {
  public static void main(String[] args) {
    try{
    int c= 100/0;
    }catch(ArithmeticException e){
      System.out.println(e);
    } 
    System.out.println("restOutput");
  }
}
