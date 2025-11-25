package week2tut;

class Animal{
    String name;
	double weight;
	String color;
	int age;
	
	public Animal(String name, double weight, String color, int age) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.age = age;
	}
}

class Dog extends Animal{
	String breed;
	boolean islindoor;
	
	public Dog(String name, double weight, String color, int age, String breed, boolean islindoor) {
		super(name, weight, color, age);
		this.breed = breed;
		this.islindoor = islindoor;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", islindoor=" + islindoor + ", name=" + name + ", weight=" + weight + ", color="
				+ color + ", age=" + age + "]";
	}
	
}

class Cat extends Animal{
	int height;
	
	public Cat(String name, double weight, String color, int age, int height) {
		super(name, weight, color, age);
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cat [height=" + height + ", name=" + name + ", weight=" + weight + ", color=" + color + ", age=" + age
				+ "]";
	}
	
}
public class Task5 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Buddy", 30.5, "Brown", 3, "Labrador", true);
		Cat cat1 = new Cat("Whiskers", 10.2, "Black", 2, 25);
		
		System.out.println(dog1.toString());
		System.out.println(cat1.toString());
		
	}

}
