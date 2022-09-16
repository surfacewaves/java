package practice_5;

public class movablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public movablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this. y= y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public String toString() {
        return "x = " + x + ", y = " + y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }
}
