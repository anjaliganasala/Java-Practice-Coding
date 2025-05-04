import java.util.Scanner;

public class ArraysWithInt {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of students:");
	int size = sc.nextInt();
	int[] marks = new int[size];
	
	for(int i=0; i<marks.length; i++) {
		System.out.println("marks for student :"+(i+1));
		marks[i]=sc.nextInt();
	}
	for(int i=0; i<marks.length; i++) {
		System.out.println("marks for students:" + (i+1)+"-->"+marks[i]);
		
	}
}
}
