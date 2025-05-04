
import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number1 :");
	int num1 = sc.nextInt();
			

	System.out.println("Enter number1 :");
	int num2 = sc.nextInt();
			

	System.out.println("Enter number1 :");
	int num3 = sc.nextInt();
			
	System.out.println("Enter number2 :");

    
    if((num1 > num2)  && (num1 > num3)) {
    	System.out.println("num1 is largest");
    }
    	
   if((num2 > num1) && (num2 > num3)) {
	   System.out.println("num2 is largest");
   }
   else {
	   System.out.println("num3 is largest");
   }
   
   }

}
    

