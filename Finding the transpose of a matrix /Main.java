import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int mat[][]=new int[n][m];
    int trans[][]=new int[m][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        mat[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        trans[j][i]=mat[i][j];
      }
    }
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(trans[i][j]+ " ");
      }
      System.out.print("\n");
    }
  }
}