import java.util.Scanner; 
public class Ques10
{
   public static void main(String args[])
   {
          Scanner sc=new Scanner(System.in); 
          System.out.print("Enter the rows you want :" );
          int n=sc.nextInt();
		  int alpha=64;
          for(int i=1; i<=n; i++)//row
        {
          for(int j=0; j<n-i; j++)//space
           {
             System.out.print(" ");
           }
         for(int k=1; k<=i; k++)//col
		 {
         System.out.print(" "+(char)(alpha+k));
         }
       System.out.println();
        }
    }
}