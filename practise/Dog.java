import java.util.Scanner;
public class Dog {
  Scanner sac= new Scanner(System.in);
      String a= sac.nextLine();
  
    public static void main(String[] args) {
      System.out.println("Enter a string to display");
      Dog obj1= new Dog();
      System.out.println(obj1.a);
    }
}
