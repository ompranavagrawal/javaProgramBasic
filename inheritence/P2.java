package inheritence;

class Person{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
}
//--------------------------------------------------------------------------------
class Student {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	
		
}
//----------------------------------------------------------------------------------
class Teacher extends Person{
	double salary;
	String subject;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher(String name, double salary, String subject) {
		super(name);
		this.salary = salary;
		this.subject = subject;
	}	
}
//------------------------------------------------------------------------------------

class CollegeStudent extends Student{
	String major;
	int year;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public CollegeStudent(String name, String major, int year) {
		super(name);
		this.major = major;
		this.year = year;
	}
}
//-----------------------------------------------------------------------------------


public class P2 {
	public static void main(String args[]) {
		Teacher t=new Teacher("Ram", 20000.0, "Maths");
		CollegeStudent c=new CollegeStudent("Shyam", "CS", 4);
		System.out.println(t.getName()+" "+t.getSalary()+" "+t.getSubject());
		System.out.println(c.getName()+" "+c.getMajor()+" "+c.getYear());
	}
}
