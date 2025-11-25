package week2tut;

class Animals{
	String name;
	float weight;
	
	public Animals(String name, float weight) {
		this.name = name;
		this.weight = weight;
	}
	public void makeSound() {
		System.out.println("Animal Sound");
	}
}

class Cats extends Animals{
	String breed;
	
	
	public Cats(String name, float weight) {
		super(name, weight);
		this.breed = breed;
	}
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Meow");
	}
}
public class Task7 {
 	public static void main (String[] args) {
 		Cats cat1 = new Cats("Kitty", 5.5f);
 		cat1.makeSound();
 	}
		
}
