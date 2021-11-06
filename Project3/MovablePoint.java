public class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "OK";
    }

    @Override
    public void moveUp()
    {
        System.out.println("MoveUp");
    }

    @Override
    public void moveDown()
    {
        System.out.println("MoveDown");
    }

    @Override
    public void moveLeft()
    {
        System.out.println("MoveLeft");
    }

    @Override
    public void moveRight()
    {
        System.out.println("MoveRight");
    }
}
