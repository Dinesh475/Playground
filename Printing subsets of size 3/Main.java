import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<a-1;i++)
      {
        for(int j=i+1;j<a;j++)
        {
          for(int k=j+1;k<a;k++)
          {
            System.out.print("("+ arr[i]+ ", "+ arr[j]+ ", "+ arr[k]+ ")");
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
}