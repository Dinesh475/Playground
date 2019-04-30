import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String temp=str.replaceAll("[AEIOUaeiou]","");
    System.out.print(temp);
    
  }
}