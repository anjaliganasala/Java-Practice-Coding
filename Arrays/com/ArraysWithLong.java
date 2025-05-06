import java.util.Scanner;

public class ArraysWithLong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of students:");
  
	int size = sc.nextInt();
   Long[] adharNumber = new Long[size];

for(int i=0; i<adharNumber.length; i++) {
	System.out.println("adhar num for student :"+(i+1));
	adharNumber[i] = sc.nextLong();
}
for(int i=0; i<adharNumber.length; i++) {
	System.out.println("adhar num for students:"+(i+1)+"->"+adharNumber[i]);
}
}
}
