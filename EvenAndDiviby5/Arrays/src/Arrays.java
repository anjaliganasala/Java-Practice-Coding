import java.util.Scanner;

   class DoubleType{
	   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr no of students :");
		
		int size = sc.nextInt();
		double[] marks = new double[size];
		
		for(int i=0; i<marks.length;i++) {
			System.out.println("marks for student :"+(i+1) +" is :");
			marks[i]=sc.nextFloat();
		}
		for(int i=0 ; i<marks.length; i++) {
			System.out.println("marks for student :"+(i+1)+ "is :" +marks[i]);
		}
		
	}
   }
