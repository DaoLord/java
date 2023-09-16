import java.util.List;
public class Listing {
  public static void main(String[] args) {
    List<String> Names = List.of("Roshan", "Oshan", "koshan");
    Iterator<String> it = Names.iterator();
    while(it.hasNext()) {
      String name = it.next();
      System.out.println(name);
    }
  }
}
