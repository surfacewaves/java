package practice_2;

public class ex1 {
}
class Shape {
    String name;
    int numberOfSides;
    {
        name = "none";
        numberOfSides = 0;
    }
    Shape() {

    }
    Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    Shape(String name, int numberOfSides) {
        this.name = name;
        this.numberOfSides = numberOfSides;
    }
    public String toString() {
        return name + " " + numberOfSides;
    }
}