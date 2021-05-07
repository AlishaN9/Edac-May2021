import java.util.Scanner;
class Ques8
{
   public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a number till you want to print pattern : ");
   int n=sc.nextInt();
   
   for(int i=n; i>=1; i--)
    {
	for(int j=1; j<=n; j++)
	{
	if(j<i)
	System.out.print(" ");
	  else
	System.out.print(" "+j);  
	}
	System.out.println();
	}
   }
}