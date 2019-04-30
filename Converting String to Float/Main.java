import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int num=str.length();
    double aft=0;
    double bef=0;
    int flag=0;
    char ch='.';
    for(int j=0;j<num;j++)
    {
      if(ch==str.charAt(j))
      {
        flag=1;
        break;
      }
    }
    if(flag==1)
    {
      for(int i=num-1;str.charAt(i)!='.'&&i>=0;i--)
      {
        aft=aft/10+(str.charAt(i)-'0');
      }
        aft=aft/10;
            for (int i = 0 ; str.charAt(i)!= '.' ; i++)
            {
                bef= bef*10 + (str.charAt(i)-'0');
            }
        }
    
        else
        {
            for (int i = 0 ; i<num; i++)
            {
                bef= bef*10 + (str.charAt(i)-'0');
            }
        }
        double sum = (aft + bef);
        System.out.printf("%.6f",sum);
    }
}
      
  