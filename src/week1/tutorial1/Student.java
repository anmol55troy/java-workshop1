package week1.tutorial1;

public class Student {
	String name = "Anmol Acharya";
	int age = 19;
	

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

}
