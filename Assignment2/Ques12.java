import java.util.Scanner;
class Ques12
{
  public static void main(String args[])
    {
	 Scanner sc= new Scanner(System.in);
     System.out.println("Enter a number till you want to print pattern : ");
     int n=sc.nextInt();
	  for(int i=1; i<=n; i++)
	   {
	    for(int j=n; j>=1; j--)
		 {
		 if(j>i)
		  System.out.print(" ");
		 else
		  System.out.print(" "+i);
		 }
		System.out.println();
	   }
	}
}