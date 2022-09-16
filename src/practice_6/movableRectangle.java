package practice_6;

public class movableRectangle implements Movable {
    protected movablePoint topAndLeft;
    protected movablePoint botAndRight;

    public boolean checkSpeed (int speed1, int speed2) {
        return speed1 == speed2;
    }

    public movableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        if (!checkSpeed(xSpeed, ySpeed))
            System.out.println("error");
        else {
            this.topAndLeft = new movablePoint(x1, y1, xSpeed, ySpeed);
            this.botAndRight = new movablePoint(x2, y2, xSpeed, ySpeed);
        }
    }

    @Override
    public String toString() {
        return "topAndLeft: " + topAndLeft +"\nbotAndRight: " + botAndRight;
    }

    @Override
    public void moveUp() {
        topAndLeft.moveUp();
        botAndRight.moveUp();
    }

    @Override
    public void moveDown() {
        topAndLeft.moveDown();
        botAndRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topAndLeft.moveLeft();
        botAndRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topAndLeft.moveRight();
        botAndRight.moveRight();
    }
}
