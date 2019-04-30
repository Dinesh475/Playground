import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int second=gcd(b,c);
      int result=gcd(a,second);
      System.out.print(result);
    }
  public static int gcd(int m,int n)
  {
    int min;
    int ref=0;
    if(m>n)
      min=n;
    else
      min=m;
    while(min>=1)
    {
    if((m%min==0)&&(n%min==0))
    {
      ref=min;
      break;
    }
      min--;
    }
    return ref;
  }
    
}