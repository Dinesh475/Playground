import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int a=in.nextInt();
      int num=0;
      for(int i=1;i<=a;i++)
      {
        for(int j=1;j<=i;j++)
        {
          num=num+1;
          if(num%2==1)
          System.out.print("*");
          else
            System.out.print("#");
        }
          System.out.print("\n");
      }
    }
}