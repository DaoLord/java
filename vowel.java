import java.util.Scanner;
public class vowel
{
    public static void main(String[] args)
    {
        System.out.println("Enter a letter.");
        Scanner sc= new Scanner(System.in);
        char letter = sc.nextLine().charAt(0);
        letter = Character.toLowerCase(letter);
        if(letter=='a' || letter== 'e' || letter == 'o' || letter == 'i' || letter == 'u')
        {
            System.out.println("It's a vowel letter.");
        }
        else
        {
            System.out.println("It's a consonant letter.");
        }
    }
}