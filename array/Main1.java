import java.util.List;
import java.util.Iterator;
public class Main1 {
  public static void main(String[] args) {
    List<String> Eing= List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    Iterator<String> obj = Eing.iterator();
    while(obj.hasNext()){
      String e = obj.next();
    }
  }
}
