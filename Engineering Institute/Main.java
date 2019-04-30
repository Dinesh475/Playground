//import required packages
import java.util.*;
class Faculty
{
  public void salary(int input)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+ input);
  }
}
class CSE extends Faculty
{
  public void salary(int input)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(input+3000)); 
  }
}
class IT extends CSE
{
  public void salary(int input)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(input+5000)); 
  }
}
class ECE extends IT
{
  public void salary(int input)
  {
    //write your ECE class statements
     System.out.println("ECE Faculty: "+(input+4500)); 
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int input=sc.nextInt();
    if(input>0)
    {
      Faculty obj1 = new Faculty();
      obj1.salary(input);
      CSE obj2 = new CSE();
      obj2.salary(input);
      IT obj3 = new IT();
      obj3.salary(input);
      ECE obj4 = new ECE();
      obj4.salary(input);
    }
    //implement your required concept here
    else
      System.out.print("null");
  }
}