import java.util.Scanner;

public class ArraysWithString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no of students:");
	int size = sc.nextInt();
	sc.nextLine();
	
	String[] name = new String[size];
	

for(int i=0; i<name.length; i++) {
	System.out.println("student name is:"+(i+1));
	name[i]=sc.nextLine();
}
for(int i=0; i<name.length; i++) {
	System.out.println("name of student"+(i+1)+"is ->"+name[i]);
}
}
}
