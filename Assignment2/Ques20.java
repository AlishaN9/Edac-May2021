import java.util.Scanner;
public class Ques20
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern :" );
        int rows = scanner.nextInt();
		for (int i = rows; i >= 1; i--) 
                { 
                        for (int j = 1; j <= i; j++)
			{
				System.out.print("  ");
			}
			for (int k = i; k <= rows; k++) 
                        { 
                                System.out.print(k + " "); 
                        } 
                        for (int l = rows-1; l >= i; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
}