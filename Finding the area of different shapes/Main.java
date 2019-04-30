import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      switch(a)
      {
        case 1: int side= sc.nextInt();
                System.out.print(side*side);
                break;
        case 2: int len=sc.nextInt();
                int bre=sc.nextInt();
                System.out.print(len*bre);
                break;
        case 3: int base=sc.nextInt();
                int height=sc.nextInt();
                System.out.print((base*height)/2);
                break;
        case 4: double pi=3.14;
                double rad=sc.nextInt();
                System.out.print(pi*rad*rad);
                break;
      }
    }
}
   