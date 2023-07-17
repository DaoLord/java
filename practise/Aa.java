public class Aa{
  public static void main(String[]args) {
    String a= "helloworld";
    String s1="hello ";
    String s2="world";
    String s="How to do things.";
    String s3="Learn Share Learn";
    String a1="hellow i am a men";
    Boolean in="Hello".equals("hello");
    Boolean aaa="Hello".equalsIgnoreCase("Hello");
    Boolean bbb="Hello".equalsIgnoreCase("hello");
    String output=s1.concat(s2);
    System.out.println(output+System.lineSeparator()
      +a.length()+System.lineSeparator()
      +a.charAt(4)+System.lineSeparator() 
      +a.substring(3)+System.lineSeparator()
      +a.substring(3, 6)+System.lineSeparator()
      +s.indexOf("d") +System.lineSeparator()
      +s3.indexOf("rn",3)+System.lineSeparator()
      +in+System.lineSeparator() //Checks equals Hello and hello 
      +out+System.lineSeparator() //checks equal Hello and hello
      +aaa+System.lineSeparator() // checks equal with ignore
      +bbb+System.lineSeparator() //checks equal with ignore
    );

  }
}
