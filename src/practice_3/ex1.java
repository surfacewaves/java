package practice_3;

public class ex1 {
}

class Circle {
    int radius;
    String color;
    {
        radius = 0;
        color = "none";
    }
    Circle() {

    }
    Circle(int radius) {
        this.radius = radius;
    }
    Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    void setRadius(int radius) {
        this.radius = radius;
    }
    int getRadius() {
        return radius;
    }
    void setColor(String color) {
        this.color = color;
    }
    String getColor() {
        return color;
    }
    public String toString() {
        return "radius = " + radius + ", " + "color: " + color;
    }
}