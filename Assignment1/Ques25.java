import java.util.Scanner;
class Ques25 {
public static void main(String[] args)
    {
        
  	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a octal Number :" );
        int num =sc.nextInt();
        int dec_value = 0;
 
        
        int base = 1;
 
        int temp = num;
        while (temp > 0) {
            
            int last_digit = temp % 10;
            temp = temp / 10;
 
            
            dec_value += last_digit * base;
 
            base = base * 8;
        }
	System.out.println("Octal to Decimal conversion is : "+dec_value);
        
    }
 }