package practice_4;

public class ex2 {
    public static void main(String[] args) {
        /*Shape shape = new Circle(1, "black", false);
        System.out.println("area of shape = " + shape.getArea());
        Circle circle0 = (Circle) shape;
        System.out.println("radius of shape = " + circle0.getRadius());*/
        Circle circle = new Circle(1, "black", false); //upcast
        //Shape shape = new Circle(...) - upcast Circle to Shape
        //Circle circle =(Circle) circle - downcast back to Circle
        System.out.println(circle);
        circle.setRadius(2);
        System.out.println("radius of circle = " + circle.getRadius());

        Square square = new Square(5, "white", false);
        System.out.println(square);
        square.setSide(4);
        square.setWidth(6);
        square.setLength(7);
        System.out.println("side of square = " + square.getLength());
        System.out.println("side of square = " + square.getWidth());
        System.out.println("side of square = " + square.getSide());

        Rectangle rectangle = new Rectangle(2, 3, "blue", false);
        System.out.println(rectangle);
        rectangle.setColor("yellow");
        System.out.println("color of rectangle: " + rectangle.getColor());
    }
}

abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public abstract String toString();
}

class Circle extends Shape {
    protected double radius;
    public Circle() {

    };
    public Circle(double radius) {
        this.radius = radius;
    };
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    };
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }

    @Override
    public String toString() {
        return "radius = " + radius + ", " + "color: " + color + ", " + "filled: " + filled;
    }
}

class   Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "width = " + width + ", " + "length = " + length + ", " + "color: " + color + ", " + "filled: " + filled;
    }
}

class Square extends Rectangle {
    protected double side;
    Square() {

    };
    Square (double side) {
        this.side = side;
    }
    Square (double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setWidth (double side) {
        this.width = side;
    }
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "side = " + side + ", " + "width = " + width + ", " + "length = " + length + ", " + "color: " + color + ", " + "filled: " + filled;
    }
}