import java.io.FileInputStream;

public class Example3 {
  public static void main(String[] args) {
    try{
    FileInputStream fin = new FileInputStream("text1.txt");
    int a = fin.read();
    System.out.println((char)a);
    // System.out.println((char)a);
    // System.out.println((char)a);
    // System.out.println((char)a);
    // System.out.println((char)a);
    fin.close();

    }catch(Exception e){
      System.out.println(e);
    }
  }
}
