import java.util.List;
import java.util.Iterator;
public class Main1 {
  public static void main(String[] args) {
    List<String> Eing= List.of("apple", "ball", "cat", "dog");
    Iterator<String> obj = Eing.iterator();
    while(obj.hasNext()){
      String e = obj.next();
      System.out.println(e);
    }
  }
}
