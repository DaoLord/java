public class Continue {
  public static void main(String[] args) {
  //   for(int i=1;i<11;i++){
  //     continue;
  //   }
  //     System.out.print(i);
  //   System.out.println("hellow");
  // }
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        // Skip even numbers and continue with the next iteration
        continue;
    }
    System.out.println("Odd number: " + i);
}
  }
}
