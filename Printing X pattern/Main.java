import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        for(int j=1;j<=a;j++)
        {
          if(i==j||(i+j==(a+1)))
          {
            System.out.print("*");
          }
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
	}
}