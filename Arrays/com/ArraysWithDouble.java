import java.util.Scanner;
public class ArraysWithDouble {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students:");
		
		int size = sc.nextInt();
		double[] marks = new double[size];

	for(int i=0; i< marks.length; i++) {
		System.out.println("marks for student :"+(i+1));
		marks[i]=sc.nextFloat();
	}
	for(int i=0; i<marks.length;i++) {
		System.out.println("marks for students :"+(i+1)+"->"+marks[i]);
	}
	}
	}


