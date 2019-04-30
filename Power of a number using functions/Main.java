import java.util.*;
class Main
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int output=power(a,b);
  System.out.print(output);
}
  public static int power(int m,int n)
  {
    int c=1;
    for(int i=1;i<=n;i++)
    {
      c=c*m;
    }
    return c;
    
  }
}
