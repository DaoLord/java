class Data{
  String Name;
  void setName(String s){
    Name = s;
  }
  String getName(){
    return Name;
  }
}
public class Encap {
  public static void main(String[] args) {
    Data d = new Data();
    d.setName("BishnuLimbu");
    System.out.println(d.getName());
  }
}
