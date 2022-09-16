package practice_6;

public class exx {
    public static void main(String[] args) {
        movableRectangle rectangle = new movableRectangle(0, 0, 0, 0, 1, 1);
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
