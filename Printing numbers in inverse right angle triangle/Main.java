import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        for(int j=a-i+1;j>=1;j--)
        {
          System.out.print(j);
        }
        System.out.print("\n");
      }
	}
}