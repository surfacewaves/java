package practice_2;

public class ex1 {
}
class Shape {
    String name;
    int numberOfSides;
    Shape(String name, int numberOfSides) {
        this.name = name;
        this.numberOfSides = numberOfSides;
    }
    public String toString() {
        return name + " " + numberOfSides;
    }
    public static void main (String args[]) {
        Shape shape = new Shape("Triangle", 3);
        System.out.println(shape);
        System.out.println(shape.toString());
    }
}