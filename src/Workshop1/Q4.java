package Workshop1;
import java.util.Scanner;



public class Q4 {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("enter the value of a:");
	 float a = scanner.nextFloat();
	 System.out.print("enter the value of b:");
	 float b = scanner.nextFloat();
	 System.out.print("enter the value of c:");
	 float c = scanner.nextFloat();
	 
	 float s = (a + b + c) / 2;
	 float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
	 System.out.println("the area of triangle is:" + area);
	 scanner.close();
 }
}
