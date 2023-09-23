public class Buffer{
  public static void main(String[]args) {
    StringBuffer sb=new StringBuffer("java");
    sb.append("is not done in joy");
    sb.insert(0,"Not "); 
    sb.replace(0, 3, "OOP");
    System.out.println(sb);  
    StringBuffer aa=new StringBuffer("Bishnu");
    System.out.println(aa.delete(1, 4));//delets first and last characters.  
    System.out.println(aa.reverse());  
    
  }

}
