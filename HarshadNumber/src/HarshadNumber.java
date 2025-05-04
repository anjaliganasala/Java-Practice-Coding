import com.sun.java_cup.internal.runtime.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		int temp= num;
		int sum= 0;
		
		while(temp>0) {
			sum+=temp%10;
			temp/= 10;
			
		}
		if(num %sum==0) {
		   System.out.println("num"+ is a harshad);
		}
		else {
			System.out.println("nu harshad);
		}
	}

}
