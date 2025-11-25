package workshop2;

class Vehicleee{
	void start() {
		System.out.println("Vehicle started");
	}
}
class Carrr extends Vehicleee{
	@Override
	void start() {
		System.out.println("Car started");
	}
	 void carrr(){
		super.start();
		System.out.println("Car constructor called");
	}
}


public class t6 {
	public static void main(String[] args) {
		Carrr myCar = new Carrr();
		myCar.carrr();  // Output: Vehicle started
		                //         Car constructor called
	}

}
