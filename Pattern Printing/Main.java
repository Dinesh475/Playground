import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        for(int j=b;j>b-i;j--)
        {
          System.out.print(j);
        }
        for(int j=1;j<=b-i;j++)
        {
          System.out.print(a-i+1);
        }
        System.out.println();
      }
    }
}