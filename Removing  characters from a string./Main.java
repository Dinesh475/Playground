import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String s2=sc.nextLine();
    int num=str.length();
    int n1=s2.length();
    int arr[]=new int[num];
    for(int i=0;i<num;i++)
    {
     arr[i]=0;
    }
    //int count=0;
    for(int j=0;j<n1;j++)
    {
      for(int k=0;k<num;k++)
      {
        if(s2.charAt(j)==str.charAt(k))
        {
          arr[k]=1;
        }
      }
    }
    for(int i=0;i<num;i++)
    {
      if(arr[i]==0)
      {
      System.out.print(str.charAt(i));
      }
    }
  }
}