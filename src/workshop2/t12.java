package workshop2;

interface A{
	default void show() {
		System.out.println("Interface A show method");
	}
}

interface B{
	default void show() {
		System.out.println("Interface B show method");
	}
}
class C implements A, B{
	public void show() {
		A.super.show();
		B.super.show();
		System.out.println("Class C show method");
	}
}

public class t12 {
	public static void main(String[] args) {
		C obj = new C();
		obj.show();
	}

}
