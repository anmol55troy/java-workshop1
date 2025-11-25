package week2tut;

interface Shape{
	void calculateArea();
	void calculatePerimeter();
}

class Circle implements Shape{
	double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle: " + area);
	}
	
	@Override
	public void calculatePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter of Circle: " + perimeter);
	}
}
public class Task11 {
	 	public static void main (String[] args) {	
 		Circle circle1 = new Circle(4.0);
 		circle1.calculateArea();
 		circle1.calculatePerimeter();
	}
	

}
