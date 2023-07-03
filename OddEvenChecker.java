import java.util.Scanner;
public class OddEvenChecker {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner aa =  new Scanner (System.in);
        int number = aa.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
