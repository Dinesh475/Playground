import java.util.*;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      int count=0,l=0;
      Arrays.sort(arr);
      for(int i=0;i<n;i++)
      {
        if(k<arr[i])
        {
          count++;
          if(count==2)
          {
            l=arr[i+1];
            break;
          }
        }
      }
        System.out.print(l);
      }
    }   
