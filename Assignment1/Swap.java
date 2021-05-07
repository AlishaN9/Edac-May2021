import java.util.Scanner;
class Swap
{
   public static void main(String args[])
   {
    int temp;
    Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter a first number :" );
	int num1=sc.nextInt();
	
	System.out.print("Enter a second number :" );
	int num2=sc.nextInt();
	
	System.out.println("Before swapping " +num1+ " and " +num2);
	temp=num1;
	num1=num2;
	num2=temp;
	
	System.out.println("After swapping " +num1+ " and " +num2);
	
   }
}