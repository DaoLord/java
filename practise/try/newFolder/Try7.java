/**
 * Try7
 */
public class Try7 {
  static void checkAge(int age){
    if(age<18)
      System.out.println("Is a minor, call FBI.");
      else
      System.out.println("Is not a minor.");
  }

  public static void main(String[] args) {
    checkAge(17);
    
  }
}
