import java.util.*;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      System.out.print(arr[a-1]);
    }
}