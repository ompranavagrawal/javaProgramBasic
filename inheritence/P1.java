package inheritence;


class Animal{
	public void eat(){
		System.out.println("animal eats");
	}
	public void sleep() {
		System.out.println("animal sleeps");
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("birds eats");
	}
	public void sleep() {
		System.out.println("birds sleeps");
	}
	public void fly() {
		System.out.println("bird flys");
	}
}

public class P1 {

	public static void main(String args[]) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
	

}