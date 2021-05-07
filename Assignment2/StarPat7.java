import java.util.Scanner;
class StarPat7
{
  public static void main(String args[])
    {
	 Scanner sc= new Scanner(System.in);
     System.out.println("Enter a number till you want to print pattern : ");
     int n=sc.nextInt();
	  for(int i=1; i<n; i++)
	   {
	    for(int j=n; j>=1; j--)
		 {
		 if(j>i)
		  System.out.print(" ");
		 else
		  System.out.print("* ");
		 }
		System.out.println();
	   }
	    for(int i=1; i<=n; i++)
     {
	 for(int k=2; k<=i; k++)
	 {
	 System.out.print(" ");
	 }
	 for(int j=n; j>=i; j--)
	 {
	 System.out.print("* ");
	 }
	 System.out.println();
	 }
	}
}