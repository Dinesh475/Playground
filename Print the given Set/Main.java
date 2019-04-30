import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      HashSet<String> set=new LinkedHashSet<String>();
      String inp=br.readLine();
      String arr[]=inp.split(",");
      for(String x:arr)
      {
        set.add(x);
      }
      System.out.print(set);
    }
}