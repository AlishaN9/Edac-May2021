import java.util.Scanner;
class Ques22
{
   public static void main(String args[])
	{
	String binary="";
	Scanner sc= new Scanner(System.in);

	System.out.print("Enter a decimal no. : ");
	int n= sc.nextInt();
	
 	int t=n;
	while(t>0)
	  {
	   int r=t%2;
	   t=t/2;
	   binary=r+binary;
	  }
	System.out.println("Binary equivalent of " +n+ " is " +binary);
	}
}
	