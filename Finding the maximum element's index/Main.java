import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    int max=arr[0];
    int count=0;
    for(int i=0;i<a;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<a;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
        count=i;
      }
    }
    System.out.print(count);
  }
}