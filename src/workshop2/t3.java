package workshop2;

class Animalll{
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Doggg extends Animalll{
	void sound() {
		System.out.println("Bark");
	}
}
class cattt extends Animalll{
	void sound() {
		System.out.println("meows");
	}
}
 
 


public class t3 {
	public static void main(String[] args) {
		Animalll myDog = new Doggg();
		Animalll myCat = new cattt();
		myDog.sound();  // Output: Bark
		myCat.sound();  // Output: meows
	}

}
