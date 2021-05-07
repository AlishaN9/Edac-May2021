import java.util.Scanner;
public class Ques16
{
   public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 integer no. :");
	int i=sc.nextInt();
	int j=sc.nextInt();
	int temp;
	System.out.println("before swapping :");
	System.out.println("first no.: "+i);
	System.out.println("second no:"+j);

	temp=i;
	i=j;
	j=temp;
	
	System.out.println("After swapping :");
	System.out.println("first no. :"+i);
	System.out.println("second no. :"+j);
	}
}
	