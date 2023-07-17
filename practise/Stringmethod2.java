public class Stringmethod2{
 public static void main(String[]args) {
   String text="Learn Share Learn";
    System.out.println(text.lastIndexOf('a'));
    String s="Hello Borld";
    String s1="   Hello World   ";
    System.out.println(s.replace('B','W'));
    System.out.println(s1.trim());//trims empty space before and after the worlds
    System.out.println(s.charAt(2));//trims empty space before and after the worlds
    String name="aabcdefghi";
    char[] chaArr=new char[6]; 
    name.getChars(2,7,chaArr,0);
    for(char c:chaArr){
    System.out.println(c);//trims empty space before and after the worlds
    } 
    
 }
}
