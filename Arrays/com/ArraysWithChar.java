import java.util.Scanner;

public class ArraysWithChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of students:");
	int size = sc.nextInt();
	char[] grade = new char[size];
	

for(int i=0; i<grade.length; i++) {
	System.out.println("grade for student:"+(i+1));
	grade[i]=sc.next().charAt(0);
}
for(int i=0; i<grade.length; i++) {
	System.out.println("student:"+(i+1)+"grade is :->"+grade[i]);
}
}
}
