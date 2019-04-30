import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int second=great(b,c);
      int result=great(a,second);
      System.out.print(result);
	}
  public static int great(int m,int n)
  {
    if(m>n)
      return m;
    else
      return n;
  }
      
}