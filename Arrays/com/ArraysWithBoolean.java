import java.util.Scanner;

public class ArraysWithBoolean {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter no of students:");
	int size = sc.nextInt();
	boolean[] istrue = new boolean[size];

for(int i=0; i<istrue.length; i++) {
	System.out.println("enter true or false:"+(i+1));
	istrue[i]= sc.nextBoolean();
}
for(int i=0; i<istrue.length; i++) {
	System.out.println("ispass:" +istrue[i]);
}
}
}
