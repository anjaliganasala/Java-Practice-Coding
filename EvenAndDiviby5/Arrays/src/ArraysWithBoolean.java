import java.util.Scanner;

public class ArraysWithBoolean {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of students :");
	int size = sc.nextInt();
	boolean[] isPass = new boolean[size];
	
	for(int i=0 ; i<isPass.length; i++) {
		System.out.println("Enter pass status :"+(i+1));
		isPass[i]=sc.nextBoolean();
	}
	for(int i=0 ; i<isPass.length; i++) {
		System.out.println("student "+ (i+1) +" pass status :"+String.valueOf(isPass[i]).toUpperCase());
}
}
}
