
public class Student {
 int id;
 int age;
 String name;
 double grade;
 
 Student(){
	 System.out.println("students....");
 }
 Student(int id,int age,String name,double grade){
	 this.id = id;
	 this.age = age;
	 this.name = name;
	 this.grade = grade;
 }
 void displayDetails() {
	 System.out.println("id :"+id+" \nage :"+age+ " \nname :"+name +" \ngrade :"+grade +"\n");
 }
 public boolean isPass() {
	 return grade > 5.0;
 }
}
