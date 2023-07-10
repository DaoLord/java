class MinBalanceException extends Exception {
  public MinBalanceException(){
    System.out.println("Balance is low.");
  }
}
public class UserDefineExample{
  public static void main(String[] args) 
  {
    try
    {
    int acc[]={100,200,300,400,500,600};
    double balance[]={900,2000,2500,2830,39};
    for(int i=0;i<5;i++){
     System.out.println("Account no: " +acc[i] + " " + "Balance" + balance[i]);
    if(balance[i]<1000){
    throw new MinBalanceException();
    }}}
    catch (MinBalanceException e) {
    System.out.println("Exception caught.");
    }
  }
}
