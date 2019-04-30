import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
    {
      arr[i]=sc.nextInt();
    }
    int rotate=sc.nextInt();
    int odd[]=new int[a];
    int even[]=new int[a];
    int odd_sz=0;
    int even_sz=0;
    for(int i=0;i<a;i++)
    {
      if(i%2==0)
      {
        odd[odd_sz]=arr[i];
        odd_sz++;
      }
      if(i%2==1)
      {
        even[even_sz]=arr[i];
        even_sz++;
      }
    }
    
 
    for(int j=1;j<=rotate;j++)
    {
      int temp=even[0];
   for(int k=1;k<=even_sz-1;k++) 
   {
    even[k-1]=even[k];
   }
      even[even_sz-1]=temp;
    }
    for(int j=1;j<=rotate;j++)
    {
        int flag=odd[odd_sz-1];
        for(int k=odd_sz-1;k>0;k--)
        {
            odd[k]=odd[k-1];
        }
        odd[0]=flag;
    }
    int r=0;
    int q=0;
  
 for(int i=0;i<a;i++)
  {
      if(i%2==0)
      {
      System.out.print(odd[r]+ " ");
      r++;
      }
      else
      {
          System.out.print(even[q]+ " ");  
          q++;
      }
     
  }
  
  }
}