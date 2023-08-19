import java.io.FileInputStream;

public class Example4 {
  public static void main(String[] args) {
    try{
    FileInputStream fin = new FileInputStream("text2.txt");
    int a=0;
    while ((a=fin.read())!=-1){
      System.out.println((char)a);
      
    }
    fin.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
