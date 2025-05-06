import java.util.Scanner;

public class ArraysWithByte {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of stu :");
	
	int size = sc.nextInt();
	byte[] age = new byte[size];
	
	for(int i=0; i<=age.length; i++) {
		System.out.println("marks of students :"+(i+1));
		age[i]=sc.nextByte();
	}
	for(int i=0;i<age.length;i++) {
		System.out.println("marks of stu :"+(i+1)+"->"+age[i]);
		
		}
	}
}

