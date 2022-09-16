package practice_5;

public class movableCircle implements Movable {
    protected int radius;
    protected movablePoint center;

    public movableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new movablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "center(" + center.x + "; " + center.y + ")";
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

}
