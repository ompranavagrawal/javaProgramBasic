package P2;
public class Patients{
	public static void main(String args[]) {
		Patient p1=new Patient("Ram", 5.8*12, 100.0);
		System.out.println(p1.BMI());
	}
	
}

class Patient {
	String name;
	Double height;
	Double weight;
	public String getName(String Name) {
		return name;
	}
	public void setName(String Name) {
		this.name=name;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public Patient(String name, Double height, Double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public double BMI() {
		return  (weight / (height * height)  )* 703;
	}
	
	
}
