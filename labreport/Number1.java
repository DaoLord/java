import java.util.Scanner;
public class Number1{
  public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int n1=a.nextInt();
    Scanner b=new Scanner(System.in);
    System.out.println("Enter the second number:");
    int n2=b.nextInt();
   System.out.println("Sum: " +(n1+n2)); //Doing addition
   System.out.println("Subtraction: " +(n1-n2)); //Doing subtractio 
   System.out.println("Multiply: " +(n1*n2)); //Multipliction 
   System.out.println("Divide: " +(n1/n2)); //Division 
    
  }
}
