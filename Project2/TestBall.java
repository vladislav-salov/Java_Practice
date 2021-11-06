public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball(12, 2);
        System.out.println("first ball test");
        System.out.println(b1);
        b1.move(12, 21);
        System.out.println(b1);
        Ball b2 = new Ball();
        System.out.println("second ball test");
        System.out.println(b2);
        b2.move(-6, 8);
        System.out.println(b2);
    }
}