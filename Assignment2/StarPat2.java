import java.util.Scanner;
class StarPat2
{
   public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number till you want to print * pattern :" );
	 int n=sc.nextInt();
	 
     for(int i=1; i<=n; i++)
	 {
	 for(int j=n-1;j>=i;j--)
	  {
	   System.out.print(" ");
	  }
	  for(int k=1;k<=i; k++)
	  {
	   System.out.print("*");
	  }
	  System.out.println();
	 }
   }
}