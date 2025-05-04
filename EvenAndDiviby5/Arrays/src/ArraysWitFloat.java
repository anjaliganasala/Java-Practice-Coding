import java.util.Scanner;

public class ArraysWitFloat {
		   public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr no of students :");
			
			int size = sc.nextInt();
			float[] cgpa = new float[size];
			
			for(int i=0; i<cgpa.length;i++) {
				
				System.out.println("cgpa for student "+(i+1) +" is :");
				cgpa[i]=sc.nextFloat();
			}
			for(int i=0 ; i<cgpa.length; i++) {
				System.out.println("cgpa for student "+(i+1)+ " is :" +cgpa[i]);
			}
		}
	   }
