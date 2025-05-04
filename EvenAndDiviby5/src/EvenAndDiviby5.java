
import java.util.Scanner;

public class EvenAndDiviby5 {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter num :");
	
	int num = sc.nextInt();
	
	if(num % 2 == 0 && num % 5 == 0 ) {
		System.out.println("number is even  and multiple by 5 ");
	}
	else if(num % 2 == 0 && num % 5 != 0 ) {
		System.out.println(" number is even but not divisible by 5");
	}
	else {
		System.out.println("number is odd");
	}
	
	}
}
	
