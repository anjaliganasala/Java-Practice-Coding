import java.util.Scanner;

public class TaxCalculation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary :");
		
		double salary = sc.nextDouble();
	
		if(salary >0 && salary <250000) {
			System.out.println("No tax");
		}
		else if( salary >= 2500000 && salary <500000) {
			double tax = (5 * salary)/100;
			System.out.println("Tax for your salary is:"+tax);
		}
		else if(salary >=500000 && salary <1000000) {
			double tax = (20 * salary)/100;
			System.out.println("TAx for your salary is :"+tax);
		}
		else if(salary >=1000000) {
			double tax = (30 * salary)/100;
			System.out.println(" tax for your salary is :"+tax);
			
		}else
		{
			System.out.println("Enter your salary positive number");
		}
	}

}
