import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        System.out.print("*");
      }
      System.out.print("\n");
      for(int i=2;i<a;i++)
      {
        for(int j=1;j<=a;j++)
        {
          if(j==1||j==a)
          {
            System.out.print("*");
          }
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
      for(int j=a;j>=1;j--)
      {
        System.out.print("*");
      }
	}
}