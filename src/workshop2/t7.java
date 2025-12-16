package workshop2;

abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double area() {
        return width * height;
    }

    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
    }
}