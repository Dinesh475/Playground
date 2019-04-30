import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=sc.nextInt();
      }
      int count=0;
      int flag=0;
      int temp[]=new int[a];
      for(int i=0;i<a;i++)
      {
        if(arr[i]==0)
          count++;
        else
        {
          temp[flag]=arr[i];
        flag++;
        }
      }
        for(int k=0;k<flag;k++)
        {
          arr[k]=temp[k];
        }
        for(int j=0;j<flag;j++)
        {
          System.out.print(arr[j]+ " ");
        }
        for(int j=0;j<count;j++)
        {
          System.out.print("0 ");
        }
    }
}