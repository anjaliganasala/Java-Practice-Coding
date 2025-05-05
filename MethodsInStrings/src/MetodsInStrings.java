import java.util.Scanner;

public class MetodsInStrings {
public static void main(String[] args) {
	String s1= new String("anjali");
	String s2 = new String("anjali");
	MetodsInStrings obj = new MetodsInStrings();
	obj.findLength("Anjali");
	obj.printCharAtIndex("Anjali");
	obj.theCharAtIndex();
	obj.checkIfEmpty("   ");
	obj.checkIfBlank("   a");
	obj.checkEqualIgnoreCase("ANJALI", "anjali");
	obj.checkIfContains("Anjali ganasala", "ganasala");
	obj.checkStartsWith();
	obj.checkIndexOf("Anjali");
	obj.checkLastIndexOf();
	obj.checkSubstring();
	obj.checkLength();
//	System.out.println(s1 == s2);           // compare address
//	System.out.println(s1.equals(s2));
	// compare content
//	
	String s3 = "Anjali";
	System.out.println(s3.toUpperCase());
	String s4 = "ANJALI";
	System.out.println(s4.toLowerCase());
    String s = " anju ";
    System.out.println(s.trim().length());
    s = s.trim();
    System.out.println(s);    //(should assign ) otherwise it work as instant
    System.out.println(s.length());
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
 void checkLength() {
	 String name = "Anjali";
	 System.out.println(name.length());
 }
}
