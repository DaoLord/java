import java.util.List;
import java.util.Iterator;
public class List {
  public static void main(String[] args) {
    List<String> Names = List.of("Roshan", "Oshan", "koshan");
    Iterator<String> it = Names.iterator();
    while(it.hasNext()) {
      String name = it.next();
      System.out.println(name);
    }
  }
}
