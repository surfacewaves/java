package practice_5;

public class ex {
    public static void main(String[] args) {
        movableCircle circle = new movableCircle(0, 0, 1, 1, 2);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}
