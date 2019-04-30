import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>b&&a>c)
      {
        System.out.print(a);
      }
      if(b>c&&b>a)
      {
          System.out.print(b);
      }
      if(c>a&&c>b)
      {
          System.out.print(c);
      }
      
    }
}