package workshop2;

class personn{
	void display() {
		System.out.println("Person details");
	}
}
class employee extends personn{
	void displayRole() {
		System.out.println("Employee details");
	}
}

class Manager extends employee{
	void displayDepartment() {
		System.out.println("Manager details");
	}
}
public class t2 {
	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.display();          // Output: Person details
		mgr.displayRole();      // Output: Employee details
		mgr.displayDepartment(); // Output: Manager details
	}

}
