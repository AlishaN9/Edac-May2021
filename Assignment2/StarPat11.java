import java.util.Scanner;

public class StarPat11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern :" );
        int rows = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i-1; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}