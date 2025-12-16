package workshop4;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name = ");
		String name = sc.nextLine();
		if (name.length() < 3) {
			throw new InvalidParameterException();
		}
		System.out.println(name);
	}
}


