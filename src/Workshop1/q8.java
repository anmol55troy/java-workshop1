package Workshop1;
import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum of two numbers is : " + sum);
		int difference = num1 - num2;
		System.out.println("The difference of two numbers is : " + difference);
		double product = num1 * num2;
		System.out.println("The product of two numbers is : " + product);
		if (num2 != 0) {
			
			double division = (double) num1 / num2;
			System.out.println("The division  of two numbers is : " + division);
		scanner.close();
		}
	}
}
