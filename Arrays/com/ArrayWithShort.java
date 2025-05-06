import java.util.Scanner;

public class ArrayWithShort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of students");
	int size = sc.nextInt();
	
	short[] rollNum = new short[size];
	

for(int i=0; i<rollNum.length; i++) {
	System.out.println("roll number for student :"+(i+1));
	rollNum[i]=sc.nextShort();
}
for(int i=0; i<rollNum.length; i++) {
	System.out.println("roll number for students :"+(i+1)+"->"+rollNum[i]);
}

}
}

