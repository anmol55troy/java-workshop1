package Workshop1;
import java.util.Scanner;

public class Q5 {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the length of square: ");
		double length = scanner.nextDouble();
		double area = length * length;
		System.out.println("The area of the square is: " + area);
		scanner.close();
	}

}

