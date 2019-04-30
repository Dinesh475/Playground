import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        for(int j=1;j<a;j++)
        {
          if(i%2==1)
          {
            System.out.print(i);
            if(j==a-1)
             System.out.print(i+1); 
          }
          else
          {
            if(j==1)
            {
              System.out.print(i+1);
            }
            System.out.print(i);
          }
        }
        System.out.print("\n");
      }
            
	}
}