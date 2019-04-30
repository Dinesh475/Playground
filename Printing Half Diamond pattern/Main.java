import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        for(int j=a;j>i;j--)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i*2-1;j++)
        {
          System.out.print("*");
        }
         System.out.print("\n");
      }
	}
}