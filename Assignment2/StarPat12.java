import java.util.Scanner;
class StarPat12
{
  public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number till you want to print * pattern :" );
   int num=sc.nextInt();
   
   for(int i=1; i<num; i++)
     {
	 for(int j=num; j>=i; j--)
	 {
	 System.out.print("*");
	 }
	 System.out.println();
	 }
	 for(int i=1; i<=5; i++)
	 {
	 for(int j=1; j<=i ;j++)
	 {
	  System.out.print("*");
	 }
	 System.out.println();
	}
   }
}