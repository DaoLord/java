public class Apple{
  private String name;
  public String getThis(){
    return name;
  }
  public void setThis(String newName){
    this.name = newName;
  }
}
public class Abstract {
  public static void main(String[] args) {
    Apple obj = new Apple();
    obj.setThis("String word"); 
    String name = obj.getThis();
    System.out.println(name);
  }
}
