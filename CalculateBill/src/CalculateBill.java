import java.util.Scanner;

public class CalculateBill {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of products :");
		
	   int numberOfProducts = sc.nextInt();
		
	   System.out.println("are you a premium user? ");
	   
	   boolean isPremiumUser = sc.nextBoolean();
	   
	   int costPerProducts = 1000;
	   
	   int discountPerProduct = 100;
	   
	  int totalCost = numberOfProducts * costPerProducts ;
	   
	  if(isPremiumUser) {
		  
		  int totalDiscount = numberOfProducts * costPerProducts;
		  totalCost = totalCost - totalDiscount;
	  }
	  System.out.println("final bill :"+totalCost);
	}
	   	
	}

