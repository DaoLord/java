class Add{
  void add(int a,int b){
    int sum = a+b;
    System.out.println(sum);
  }
  void add(){
    System.out.println("101");
  }
}
public class OverRide {
  public static void main(String[] args) {
    Add obj1 = new Add();
    obj1.add(10,90);
    obj1.add();
  }
}
