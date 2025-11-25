package workshop2;

abstract class Appliance {
	void trunOn() {
		System.out.println("Appliance is turned on.");
	}
	abstract void Operate();
}
class WashingMachine extends Appliance {
	void Operate() {
		System.out.println("Washing clothes.");
	}
}


public class t8 {
	public static void main(String[] args) {
		Appliance wm = new WashingMachine();
		wm.trunOn();
		wm.Operate();
	}

}
