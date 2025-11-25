package week2tut;

class GrandPArent{
	void displayGrant() {
		System.out.println("I am a grandparent");
	}
}

class Parent extends GrandPArent{
	void displayParent() {
		System.out.println("I am a parent");
	}
}

class Child extends Parent{
	void displayChild() {
		System.out.println("I am a child");
	}
}


public class Task4 {
	public static void main (String[] args) {
		Child child = new Child();
		child.displayChild();
		child.displayParent();
		child.displayGrant();
	}

}
