public class Ball
{
    // Положение мяча.
    private double x = 0.0;
    private double y  = 0.0;

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Ball() {}

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void SetX(double x)
    {
        this.x = x;
    }

    public void SetY(double y)
    {
        this.y = y;
    }

    public void SetXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp)
    {
        x += xDisp;
        y += yDisp;
    }

    public String toString()
    {
        return "x = " + x + " y = " + y;
    }
}

