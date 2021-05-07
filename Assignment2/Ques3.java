import java.util.Scanner;
class Ques3
{
  public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a number till you want to print pattern : ");
   int n=sc.nextInt();
   int alpha=64;
   for(int i=1; i<=n; i++)
    {
	for(int j=1; j<=i; j++)
	{
	System.out.print((char)(alpha+j));
	}
	System.out.println();
	}
  
  }
}