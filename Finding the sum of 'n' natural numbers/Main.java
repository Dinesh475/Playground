import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int result=sum(a);
      System.out.print(result);
    }
  public static int sum(int a)
  {
    if(a>=1)
    {
      return a+sum(a-1);
    }
    else
      return a;
  }
}