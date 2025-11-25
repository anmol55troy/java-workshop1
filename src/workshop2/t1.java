package workshop2;

 class Veehicle{
	void start() {
		System.out.println("Vehicle started");
	}
}

 class Car extends Veehicle{
	void start() {
		System.out.println("Car started");
	}
}
 

public class t1 {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.start();  // Output: Car started
	}

}
