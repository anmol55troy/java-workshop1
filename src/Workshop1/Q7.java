package Workshop1;
import java.util.Scanner;

public class Q7 {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("Enter the principal amount: ");
	 double principal = scanner.nextDouble();
	 System.out.print("Enter the rate of interest: ");
	 double rate = scanner.nextDouble();
	 System.out.print("Enter the time in years: ");
	 double time = scanner.nextDouble();
	 double interest = (principal * rate * time) / 100;
	 System.out.print("Interst amount : " +interest);
	 scanner.close();
	
 }
}
