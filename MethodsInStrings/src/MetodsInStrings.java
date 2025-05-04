import java.util.Scanner;

public class MetodsInStrings {
public static void main(String[] args) {
	String s1= new String("anjali");
	String s2 = new String("anjali");
	MetodsInStrings ms = new MetodsInStrings();
	ms.findLength("Anjali");
	ms.printCharAtIndex("Anjali");
	ms.theCharAtIndex();
	ms.checkIfEmpty("   ");
	ms.checkIfBlank("   a");
	ms.checkEqualIgnoreCase("ANJALI", "anjali");
	ms.checkIfContains("Anjali ganasala", "ganasala");
	ms.checkStartsWith();
	ms.checkIndexOf("Anjali");
	ms.checkLastIndexOf();
	ms.checkSubstring();
//	System.out.println(s1 == s2);           // compare address
//	System.out.println(s1.equals(s2));
	// compare content
//	
	
}
 void findLength(String s) {                 // Instance methods
	 System.out.println(s.length());
 }
 void printCharAtIndex(String s) {
	 System.out.println(s.charAt(0));
 }
 void theCharAtIndex() {                    // instance methods
	 String s = "Anjali";                     // local var - (inside instance methods)
	 System.out.println(s.charAt(1));
	 System.out.println(s.charAt(2));	 
 }
 void checkIfEmpty(String s) {
	 System.out.println(s.isEmpty());
 }
 void checkIfBlank(String s) {
	 System.out.println(s.isBlank());
 }
 void checkEqualIgnoreCase(String s1 , String s2) {
	 System.out.println(s1.equalsIgnoreCase(s2));
 }
 void checkIfContains(String s1 , String s2) {
	 System.out.println(s2.contains(s1));
	 System.out.println(s1.contains(s2));
 }
 void checkStartsWith() {
	 String s = "Anju";
	 System.out.println(s.startsWith("ju"));
 }
 void checkEndsWith() {
	 System.out.println();
 }
 void checkIndexOf(String s) {
	 System.out.println(s.indexOf("j"));
 }
 void checkLastIndexOf() {
	 String s = "chaidya";
	 System.out.println(s.lastIndexOf('a'));
 }
 // substring
 void checkSubstring() {
	 String s1 = "vaishya";
	 System.out.println(s1.substring(0,5));
	 System.out.println(s1.substring(0));
 }
}
