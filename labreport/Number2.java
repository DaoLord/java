import java.util.Scanner;
public class Number2 {
  public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("Enter a letter:");
    char aa=a.next().charAt(0);
    char ch=Character.toLowerCase(aa); 
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
      System.out.println("It's a vowel");
    }
    else{
      System.out.println("It's a consonant");
    }
  }
}
