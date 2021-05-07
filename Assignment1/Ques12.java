import java.util.Scanner;
public class Ques12
{
    public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter First No :");
	int n1= sc.nextInt();

	
	System.out.println("Enter Second No :");
	int n2= sc.nextInt();

	System.out.println("Enter Third No :");
	int n3= sc.nextInt();

	System.out.println("Average :"+(n1+n2+n3)/3);
	}
}