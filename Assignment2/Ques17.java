import java.util.Scanner;
class Ques17
{
	public static void main(String[] args)
	{
	 Scanner sc= new Scanner(System.in);
     System.out.println("Enter a number till you want to print pattern : ");
     int n=sc.nextInt();
	 int temp=1;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}
}