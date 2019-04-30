import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      LinkedList<String> list=new LinkedList<String>();
      String str=br.readLine();
      String m1=br.readLine();
      String arr[]=str.split(",");
      for(String x:arr)
      {
        list.add(x);
      }
      System.out.println(list);
      System.out.println("Size of the linked list: " +list.size());
      System.out.println("Is LinkedList empty? " +list.isEmpty());
      System.out.println("Does LinkedList contains " +m1 +"?");
      System.out.println(list.contains(m1));
    }
}