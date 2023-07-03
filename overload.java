public class overload
{
    public static  void main(String[]args)
    {
        mux(10,20);
        mux(20,30,40);
    }
    public static void mux(int a,int b)
    {
        System.out.println("multiple is"+(a*b));
    }
    public static void mux(int a,int b,int c)
    {
        System.out.println(a*b*c);
    }

}