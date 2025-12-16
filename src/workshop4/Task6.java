package workshop4;
import java.util.Scanner;

class NegativeNumberException extends RuntimeException{
	public NegativeNumberException(String msg) {
		super(msg);
	}
}

public class Task6 {
	public static void checkNum(int num) {
		if (num < 0) {
			throw new NegativeNumberException("Enter positive number");
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number = ");
			int num = sc.nextInt();
			checkNum(num);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}