interface Bank{
  float rateofInterest();
}
class NTC implements Bank{
  public float rateofInterest(){
    return 9.15f;
  }
}
class Sanima implements Bank{
  public float rateofInterest(){
    return 9.7f;
  }
}
class aa{
  public static void main(String[]args){
    Bank b=new Sanima();
    System.out.println("ROI:" + b.rateofInterest());
  }
}
