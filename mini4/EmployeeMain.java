package mini4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Menu");
		System.out.println("1. Add an Employee");
		System.out.println("2. Display All");
		System.out.println("3. Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		while(choice<=2) {
			switch (choice) {
			case 1:
				System.out.println("Enter Employee ID:");
				int id=sc.nextInt();
				System.out.println("Enter Employee Name:");
				String name=sc.next();
				System.out.println("Enter Employee age:");
				int age=sc.nextInt();
				System.out.println("Enter Employee Salary:");
				int salary=sc.nextInt();
				Employee e=new Employee(id, name, age, salary);
				try {
					e.writeToFile(e);
				}
				catch(Exception exc){
					exc.printStackTrace();
				}
				
				break;				
			case 2:
				Employee e1=new Employee();
				try {
					System.out.println("----Report----");
					e1.readFromFile();
					System.out.println("----End of Report----");
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				break;
			default:
				break;
			}
			System.out.println("Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			choice=sc.nextInt();
		}
		System.out.println("Exiting the System");
	}

}
//--------------------------------------------------------------------------------------------
class Employee{
	int id;
	String Name;
	int age;
	int salary;
	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return id +" "+ Name +" "+ age +" "+ salary+"\n" ;
	}
	public void writeToFile(Employee obj) throws IOException {
		String fileContent = obj.toString();
	     
	    BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\pranavJava\\javaProjects\\src\\mini4\\Input.txt",true));
	    writer.write(fileContent);
	    writer.close();
	}
	public void readFromFile()throws IOException{
		String fileName = "E:\\\\pranavJava\\\\javaProjects\\\\src\\\\mini4\\\\Input.txt";
		File file = new File(fileName);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine()) != null){
				
				System.out.println(line);
			}
		}
		catch (Exception e) {
			System.out.println("Error in reading the file or file not found");
		}

	}
}
