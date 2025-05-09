
public class Stu {
public static void main(String[] args) {
	 
	Student stu1 = new Student(101,20,"anjali",9.0);
	Student stu2 = new Student(102,20,"bhagi",9.9);
	Student stu3 = new Student(102,20,"vaishu",9.0);
	Student stu4 = new Student(102,20,"chaithu",10);
	Student stu5 = new Student(102,20,"sai",9.9);
	
	stu1.displayDetails();
	stu2.displayDetails();
	stu3.displayDetails();
	stu4.displayDetails();
	stu5.displayDetails();

	System.out.println("Is "+stu1.name+" isPass? "+stu1.isPass()+"\n");
	System.out.println("Is "+stu2.name+" isPass? "+stu1.isPass()+"\n");
}
}
