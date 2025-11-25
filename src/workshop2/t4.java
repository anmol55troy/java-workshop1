package workshop2;

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("Bird is flying");
	} 
}
class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Eagle extends Animal implements Flyable {
	public void fly() {
		System.out.println("Eagle is soaring high");
	}
}


public class t4 {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		eagle.eat(); // Output: Animal is eating
		eagle.fly(); // Output: Eagle is soaring high

		Bird bird = new Bird();
		bird.fly(); // Output: Bird is flying
	}

}
