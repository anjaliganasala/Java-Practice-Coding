import java.util.Scanner;

public class ArraysWithShort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of students:");
    int size = sc.nextInt();                             // roll numbers -- short type
	short[] roll = new short[size];
	
	for(int i=0; i<roll.length; i++) {
		System.out.println("roll no for student :"+(i+1));
		roll[i]=sc.nextShort();
	}
	for(int i=0; i<roll.length; i++) {
	    System.out.println("roll no for student :"+(i+1)+"-->"+roll[i]);
		
	}
	
}
}
