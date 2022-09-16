package practice_3;

public class testCircle {
    public static void main(String[] args) {
        Circle circle_1 = new Circle();
        Circle circle_2 = new Circle(1);
        Circle circle_3 = new Circle(2, "black");
        circle_2.setColor("blue");
        System.out.println("color of circle_2 = " + circle_2.getColor());
        System.out.println(circle_1);
        System.out.println(circle_2);
        System.out.println(circle_3);
    }
}
