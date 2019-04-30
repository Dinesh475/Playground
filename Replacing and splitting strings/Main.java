import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      int no=sc.nextInt();
      String s3=s1.replace(s1,s2);
      String[] arr=s3.split(" ",no);
      for(String a:arr)
      {
        System.out.println(a);
      }
    }
}