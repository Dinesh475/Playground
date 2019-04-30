import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    int n1=s1.length();
    int n2=s2.length();
    int count=0;
    for(int i=0;i<n1-n2+1;i++)
    {
      boolean output=true;
      for(int j=0;j<n2;j++)
      {
        if(s1.charAt(i+j)!=s2.charAt(j))
        {
          output=false;
        }
      }
      if(output==true)
      {
        count++;
      }
    }
    System.out.print(count);
  } 
}