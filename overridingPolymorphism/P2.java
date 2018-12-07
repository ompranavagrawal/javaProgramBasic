package overridingPolymorphism;

class Shape{
	public void draw() {
	}
	public void erase() {
	}
}
//------------------------------------------------------------------------------------------------
class Circle extends Shape{
	public void draw() {
		System.out.println("drawing circle");
	}
	public void erase() {
		System.out.println("erasing circle");
	}
}
//---------------------------------------------------------------------------------------------
class Triangle extends Shape{
	public void draw() {
		System.out.println("drawing triangle");
	}
	public void erase() {
		System.out.println("erasing triangle");
	}
}
//------------------------------------------------------------------------------------------------
class Square extends Shape{
	public void draw() {
		System.out.println("drawing Square");
	}
	public void erase() {
		System.out.println("erasing square");
	}
}
//----------------------------------------------------------------------------------------------

public class P2 {

	public static void main(String[] args) {
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
