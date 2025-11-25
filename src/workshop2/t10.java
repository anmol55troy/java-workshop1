package workshop2;

interface Swimmable {
	void swim();
}
interface Flyablee {
	void fly();
}
class Duck implements Swimmable, Flyablee {
	public void swim() {
		System.out.println("Duck is swimming.");
	}
	public void fly() {
		System.out.println("Duck is flying.");
	}
}

public class t10 {
	public static void main(String[] args) {
		Duck d = new Duck();
		d.swim();
		d.fly();
	}
	

}
