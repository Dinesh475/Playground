import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int arr[]=new int[num];
      int temp[]=new int[num];
      for(int i=0;i<num;i++)
      {
        arr[i]=sc.nextInt();
      }
      int count=1,flag=0;
      for(int i=0;i<num;i++)
      {
        temp[i]=count;
        count++;
      }
      for(int i=0;i<num;i++)
      {
        flag=0;
        for(int j=0;j<num;j++)
        {
          if(temp[i]!=arr[j])
          {
            flag++;
          }
        }
        if(flag==num)
        {
          System.out.print(temp[i]);
        }
      }
      
      
    }
}