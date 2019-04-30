import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
     
      for(int i=2;i<a;i++)
      {
         int count=0;
        for(int j=2;j<a;j++)
        {
          if(i%j==0)
          {
            count++;
            
          }
        }
        if(count==1)
        {
          System.out.println(i);
        }
      }
	}
}