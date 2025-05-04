
import java.util.Scanner;

public class ArraysWithbyte {  
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of students:");
		
		byte size = sc.nextByte();               // for byte type -128 to 127 so i take student age
		byte[] roll = new byte[size];
		
		for(int i=0 ; i<roll.length; i++) {
			System.out.println("enter age of student"+(i+1));
		    roll[i]=sc.nextByte();
		}
		for(int i=0; i<roll.length; i++) {
			System.out.println("age of student:"+(i+1)+ "-->"+roll[i]);
		}
	}
	
	}