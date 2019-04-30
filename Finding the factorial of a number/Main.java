import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int result=fact(a);
    System.out.print(result);
  }
  public static int fact(int a)
  {
   
    if(a!=0)
    {
     return a*fact(a-1);
    }
    else
      return 1;
  }
}