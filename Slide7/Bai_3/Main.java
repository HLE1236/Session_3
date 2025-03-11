public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(100.0, "red", true);
        Shape rectangle = new Rectangle(12.0, 3.0, "green", false);
        Shape square = new Square(2006.0, "yellow", true);
        //circle_test
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        //rectangle_test
        System.out.println(rectangle);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        //square_test
        System.out.println(square);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}