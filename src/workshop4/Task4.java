package workshop4;

public class Task4 {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0); // ArithmeticException

			String name = null;
			System.out.println(name.length()); // NullPointerException

			int[] nums = { 1, 2, 3 };
			System.out.println(nums[5]); // ArrayIndexOutOfBoundException
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
