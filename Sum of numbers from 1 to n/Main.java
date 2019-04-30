import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int sum=0;
      for(int i=1;i<=a;i++)
      {
        sum=sum+i;
      }
      System.out.print(sum);
	}
}