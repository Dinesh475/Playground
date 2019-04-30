import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int sum=0,rem,b=1,c;
      int a=sc.nextInt();
      c=a;
      while(a>0)
      {
        rem=a%10;
        for(int i=1;i<=rem;i++)
            {
              b=b*i;
            }
         sum=sum+b;
        b=1;
        a=a/10;
      }
      if(sum==c)
      {
       System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
	}
}