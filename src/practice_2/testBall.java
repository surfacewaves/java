package practice_2;

public class testBall {
    public static void main(String[] args) {
        Ball ball_1 = new Ball();
        Ball ball_2 = new Ball("volleyball");
        Ball ball_3 = new Ball("basketball", 1);
        ball_2.setWeight(0.5F);
        System.out.println(ball_3.getNameSport());
        System.out.println(ball_1);
        System.out.println(ball_2);
        System.out.println(ball_3);
    }
}
