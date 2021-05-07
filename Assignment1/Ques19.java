import java.util.Scanner;
public class Ques19 
{
 public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
	System.out.println("Enter binary No. : ");
	int n1=sc.nextInt();
     
        
        int dec_value = 0;
 
        
        int base = 1;
 
        int temp = n1;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
       System.out.print("decimal number : "+dec_value);
    }
 
}