import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] words=str.split(" ");
    for(int i=0;i<words.length;i++)
    {
      if(words[i]!=null)
      {
        int x=words[i].length();
        for(int j=x-1;j>=0;j--)
        {
          System.out.print(words[i].charAt(j));
        }
      }
      System.out.print(" ");
    }
  }
}