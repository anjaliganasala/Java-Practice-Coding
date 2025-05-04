import java.util.Scanner;

public class ArraysWithLong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of students :");
	int size = sc.nextShort();
	Long[] adhar = new Long[size];
	
	for(int i=0; i<adhar.length; i++) {
		System.out.println("AdharNumber of Student :" +(i+1));
		adhar[i]=sc.nextLong();
	}
	
	for(int i=0; i<adhar.length; i++) {
		System.out.println("AdharNumber of Student :" +(i+1)+"    :"+adhar[i]);
}
}
}
