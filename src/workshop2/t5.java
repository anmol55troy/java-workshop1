package workshop2;

class Animall{
 Animall(){
	 System.out.println("Animal created");
 }
}
class Dog extends Animal{
	Dog(){
		super();
		System.out.println("Dog created");
	}
}

public class t5 {
  	public static void main(String[] args) {
		Dog myDog = new Dog();
	}
}
