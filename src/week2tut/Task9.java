package week2tut;

abstract class Employee {
	String name;
	String position;

	public Employee(String name, String position) {
		this.name = name;
		this.position = position;
	}

	public abstract void calculateSalary();

	public void getDetails() {
		System.out.println("Name = " + name);
		System.out.println("Position = " + position);
	}
}

class FullTimeEmployee extends Employee {
	double salary;

	public FullTimeEmployee(String name, String position, double salary) {
		super(name, position);
		this.salary = salary;
	}

	@Override
	public void calculateSalary() {
		System.out.println(super.name + "earns" + salary);
	}

}

class PartTimeEmployee extends Employee {
	double hours;
	double hourlyWage;

	public PartTimeEmployee(String name, String position, double hours, double hourlyWage) {
		super(name, position);
		this.hours = hours;
		this.hourlyWage = hourlyWage;
	}

	@Override
	public void calculateSalary() {
		System.out.println(super.name + "earns" + (hourlyWage * hours));
	}
}

public class Task9 {
	public static void main(String[] args) {
		FullTimeEmployee emp1 = new FullTimeEmployee("Alice", "Developer", 60000);
		PartTimeEmployee emp2 = new PartTimeEmployee("Bob", "Intern", 20, 15);

		emp1.getDetails();
		emp1.calculateSalary();

		emp2.getDetails();
		emp2.calculateSalary();
	}

}
