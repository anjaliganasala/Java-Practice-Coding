import java.util.Scanner;

public class ReverseOfAString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter str:");
	String input = sc.nextLine();
	
	ReverseOfAString obj = new ReverseOfAString();
	
	String res = obj.reverse(input);
	System.out.println("rev str :"+res);
}
String reverse(String s) {
	String result = "";
	for(int i=s.length()-1; i>=0; i--) {
	char temp = s.charAt(i);
	result +=temp;
}
	return result;
}
}
