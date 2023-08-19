import java.io.FileOutputStream;
public class Example1 {
  public static void main(String[] args) {
        
    try{
        FileOutputStream fout = new FileOutputStream ("text1.txt");
        fout.write(65);
        fout.write(66);
        fout.write(67);
        fout.write(68);
        fout.write(69);
        fout.close();
        System.out.println("successfull...");

    }catch(Exception e){
      System.out.println(e);
    }
  }
}

