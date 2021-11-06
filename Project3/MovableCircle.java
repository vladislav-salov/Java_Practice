public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x,int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        center.x = x;
        center.y = y;
        center.xSpeed = x;
        center.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {}

    @Override
    public void moveDown() {}

    @Override
    public void moveLeft() {}

    @Override
    public void moveRight() {}
}
