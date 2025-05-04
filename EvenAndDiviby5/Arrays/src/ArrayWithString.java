import java.util.Scanner;

public class ArrayWithString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students :");
		int size = sc.nextInt();
		sc.nextLine();
		String[] name = new String[size];
		
		for(int i=0; i<name.length; i++) {
			System.out.println("enter student name :"+(i+1));
			name[i]=sc.nextLine().toUpperCase();
		}
		for(int i=0 ; i<name.length; i++) {
			System.out.println("enter student names :"+(i+1)+ " "+name[i]);
		}
	}
}
