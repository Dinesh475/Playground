import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int freq[]=new int[k];
      for(int i=0;i<k;i++)
      {
        freq[i]=0;
      }
      int temp[]=new int[k];
      int count=1;
      for(int i=0;i<k;i++)
      {
        temp[i]=count;
        count++;
      }
      for(int j=0;j<n;j++)
      {
        freq[arr[j]-1]++;
      }
      for(int l=0;l<k;l++)
      {
        System.out.print(temp[l]+ " "+ freq[l]);
        System.out.print("\n");
      }
    }
}