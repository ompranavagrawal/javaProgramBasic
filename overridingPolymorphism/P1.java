package overridingPolymorphism;

class Fruit {
	String name;
	String taste;
	String size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Fruit(String name, String taste, String size) {
		super();
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	public void eat() {
	}
}
//-----------------------------------------------------------------------------------
class Apple extends Fruit{	
	public Apple(String name, String taste, String size) {
		super(name, taste, size);
	}
	public void eat() {
		System.out.println(name+" "+taste);
	}
}
//------------------------------------------------------------------------------------------
class Orange extends Fruit{
	
	public Orange(String name, String taste, String size) {
		super(name, taste, size);
	}
	public void eat() {
		System.out.println(name+" "+taste);
	}
}

//----------------------------------------------------------------------------------------------
public class P1 {
	public static void main(String args[]) {
		Apple a=new Apple("Apple", "Sweet", "medium");
		a.eat();
		Orange o=new Orange("Orange", "Sour", "small");
		o.eat();
	}

}
