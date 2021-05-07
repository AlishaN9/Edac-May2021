import java.util.Scanner;

public class Ques23
{
    public static void main(String args[])
    {
        int binnum, rem;
        String hexdecnum="";
        
        char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Binary Number : ");
        binnum = sc.nextInt();
		
        while(binnum>0)
        {
            rem = binnum%16;
            hexdecnum = hexa[rem] + hexdecnum;
            binnum = binnum/16;
        }
		
        System.out.print("Hexadecimal Value of " +binnum+ " is : ");
        System.out.print(hexdecnum);
            
    }
}
