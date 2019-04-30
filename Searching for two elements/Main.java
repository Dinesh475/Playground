import java.util.*;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int arr[]=new int[a];
      int count=0;
      int con=0;
      for(int i=0;i<a;i++)
      {
        arr[i]=sc.nextInt();
      }
      int inp1=sc.nextInt();
      int inp2=sc.nextInt();
      for(int i=0;i<a;i++)
      {
        if(arr[i]==inp1)
        {
          System.out.println(i);
          count++;
        }
      }
      if(count==0)
         System.out.println(-1);
      for(int i=0;i<a;i++)
      {
        if(arr[i]==inp2)
        {
          System.out.println(i);
          con++;
        }
      }
        if(con==0)
         System.out.println(-1);
    }
}