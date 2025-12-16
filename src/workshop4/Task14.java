package workshop4;

public class Task14 {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0); // ArithmeticException

			String name = null;
			System.out.println(name.length()); // NullPointerException
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("Exception Occured");
		}
	}
}