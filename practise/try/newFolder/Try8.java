/**
 * Try8
 */
public class Try8 {
 static int totalSum(int num){
      if(num>0)
        return num + totalSum(num-1);
      else
        return 0;
    }

  public static void main(String[] args) {
    System.out.println(totalSum(100));
  }
}
