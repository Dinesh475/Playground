import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int d=a;
    if(a<0)
    {
      a=(-1)*a;
    }
    int b=a,count=0;
    while(b>0)
    {
      b=b/10;
      count++;
    }
    char arr[]=new char[count];
    int x=count;
    x=x-1;
    while(a>0)
    {
      char ch=(char)((a%10)+'0');
      arr[x]=ch;
      x--;
      a=a/10;
    }
    if(d>0)
     System.out.print(arr); 
    else
    {
      System.out.print("-");
      System.out.print(arr);
    }
      
  }
}