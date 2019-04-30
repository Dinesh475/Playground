import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int b=1;
      int a=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        b=b*i;
      }
      System.out.print(b);
      
	}
}