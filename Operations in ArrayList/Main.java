import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> list= new ArrayList<String>();
      int n=1;
      while(n!=0)
      {
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display"); 
        System.out.println("4.Exit");
        int v=Integer.parseInt(br.readLine());
        switch(v)
        {
          case 1: String str=br.readLine();
                  String arr[]=str.split(",");
                  for(String x:arr)
                  {
                    list.add(x);
                  }
                  //System.out.pirnt(list);
                  break;
          case 2: System.out.print("Enter the index value to be deleted:");
                        int ch1 = Integer.parseInt(br.readLine());
                        System.out.println(ch1);
                        list.remove(ch1);
                        break;
                case 3: System.out.println(list);
                        break;
                case 4: n=0;
                        break;
        }
    }
}
}