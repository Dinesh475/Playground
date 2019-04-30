import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int count=0,a,rem,pow=1,sum=0;
      int b;
      a=num;
      b=a;
      while(num>0)
      {
        count++;
        num=num/10;
      }
      while(a>0)
      {
        rem=a%10;
       for(int i=1;i<=count;i++)
       {
         pow=pow*rem;
       }
        sum=sum+pow;
        pow=1;
        a=a/10;
      }

      if(sum==b)
      {
      
      System.out.print("Armstrong Number");
      }
      else
        System.out.print("Not a Armstrong Number");
	}
}