class Dog{
  private String word;
  public String getWord(){
    return word;
  }
  public void setWord(String NewWord){
    this.word = newWord;
  }
}
public class Abstract1 {
  public static void main(String[] args) {
    Dog obj1 = new Dog();
    obj1.setWord("KOirala Bishal");
    String word = obj1.getWord();
    System.out.println(word);
  }
}
