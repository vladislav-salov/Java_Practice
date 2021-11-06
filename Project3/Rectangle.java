public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.filled = false;
        this.color = "blue";
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length)
    {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.color = color;
        this.filled = filled;
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return length;
    }

    @Override
    public double getArea()
    {
        return width * length;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    @Override
    public String toString()
    {
        return "Shape: Rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}
