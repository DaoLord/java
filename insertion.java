import java.util.*;
class insertion{
  public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[]args) {
    int arr[]={9,5,1,4,3};
    //insertion sort
    for (int i=1;i<arr.length;i++){
      int current=arr[i];
      int j=i-1;
      while(j>=0 && current<arr[j]){
        //keeps swapping
        arr[j+1]=arr[j];
        j--;
      }
      //placement
      arr[j+1]=current;
    }
    printarr(arr);
  }
}
