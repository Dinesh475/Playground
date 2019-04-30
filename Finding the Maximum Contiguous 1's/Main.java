import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int arr[]=new int[num];
      int x=0;
      for(int i=0;i<num;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<num;i++)
      {
        if(arr[i]!=0)
        {
          x=x+arr[i];
        }
        else
        {
          break;
        }
      }
      System.out.print(x);
    }
}