import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      HashSet<String> str=new LinkedHashSet<String>();
      String x= br.readLine();
      String arr[]=x.split(",");
      for(String i:arr)
      {
        str.add(i);
      }
      System.out.println(str);
      String s1=br.readLine();
      String s2=br.readLine();
      System.out.println("Enter the value to be deleted: " +s1);
      str.remove(s1);
      System.out.println(str);
       System.out.println("Enter the value to be added: " +s2);
      str.add(s2);
      System.out.println(str);
      
      
    }
}