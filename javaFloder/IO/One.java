import java.io.FileInputStream;
import java.io.IOException;

public class One {
  public static void main(String[] args) {
    try{
    FileInputStream fileStream = new FileInputStream("text.txt");
    int data = fileStream.read();
    while(data!=-1){
      data = inputStream.read(); 
    }
    inputStream.close();
  }catch(IOException e){
      System.out.println("error");
    }
}
