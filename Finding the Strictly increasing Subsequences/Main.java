import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
    {
      arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<a;i++)
    {
      int x=0;
      for(int j=i+1;j<a;j++)
      {
        if(x<arr[j])
        {
        if(arr[i]<arr[j])
        {
          System.out.print(arr[i]+ ","+ arr[j]);
          System.out.print("\n");
          x=arr[j];
        }
        }
      }
    }
  }
}