class Add{
    void add(int a,int b){
    int sum = a+b;
    System.out.println(sum);
  }
  void add(int a, int b, int c){
    int sum = a+b+c;
    System.out.println(sum);
  }
}

public class OverLoad {
  public static void main(String[] args) {
    Add obj1 = new Add();
    obj1.add(10,90);
    obj1.add(10,20,30);
    
  }
}
