import java.util.Scanner;
public class Scanmulti
{
   public static void main(String args[])
     {
	Scanner sc= new Scanner(System.in);

	System.out.println("First Number :" );
	int n1= sc.nextInt();

	System.out.println("Second Number :" );
	int n2= sc.nextInt();
	
 	System.out.println(n1+" * "+n2+ " = " +n1*n2);
	}
}