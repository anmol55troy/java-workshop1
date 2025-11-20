package Workshop1;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        System.out.println(r1.toString());
    }
}
