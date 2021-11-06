public class Square extends Rectangle
{
    private double side;

    public Square()
    {
        this.filled = false;
        this.color = "blue";
        side = 1;
    }

    public Square(double side, String color, boolean filled)
    {
        this.filled = filled;
        this.color = color;
        this.side = side;
    }

    public  double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public void setWidth(double side)
    {
        this.width = side;
    }

    @Override
    public void setLength(double side)
    {
        this.length = side;
    }

    @Override
    public String toString()
    {
        return "Shape: Square, side: " + this.side + ", color: " + this.color;
    }
}
