import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int second;
   while(a>99)
   {
     a=a/10;
    
   }
    second=a%10;
    System.out.print(second);
  }
}
