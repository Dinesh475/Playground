import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int arr[]=new int[num];
      for(int i=0;i<num;i++)
      {
        arr[i]=sc.nextInt();
      }
      int x=0,front=0,end=num-1;
      while(front<end)
      {
        if(arr[front]!=arr[end])
        {
          x=1;
          break;
        }
        front++;
        end--;
      }
      if(x==0)
      {
        System.out.print("Yes");
      }
      else
        System.out.print("No");
      
    }
}