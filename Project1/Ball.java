public class Ball
{
    private double x;
    private double y;

    public Ball(double x)
    {
        this.x = x;
        this.y = y;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return this.x + ", " + this.y;
    }
    public void move(double xDisp, double yDisp)
    {
        this.x += x;
        this.y += y;
    }
}
