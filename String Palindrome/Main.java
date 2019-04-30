import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int num=str.length();
      int front=0,end=num-1;
      boolean output=true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
           {
             output=false;
             break;
           }
           front++;
           end--;
     }
      if(output==true)
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}