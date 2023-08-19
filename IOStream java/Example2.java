import java.io.FileOutputStream;

public class Example2 {
  public static void main(String[] args) {
    try{
    FileOutputStream fout = new FileOutputStream("text2.txt");
    String a = "Manisha is the name of my sister.";
    byte b[] =a.getBytes();
    fout.write(b);
    fout.close();
    System.out.println("Successfull...");
    }catch(Exception e) {
      System.out.println(e);
    } 
  }
}

