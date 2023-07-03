public class conducting{
    static int Add(int a, int b){
        return a+b;
     }
    static int Add(int a, int b, int c){
        return a+b+c;
    }
    
    public static void main(String[]args){
        int result1 = Add(10, 20);
        int result2 = Add(98, 15, 70);
        System.out.println(result1);
        System.out.println("\n");
        System.out.println(result2);
    }
}