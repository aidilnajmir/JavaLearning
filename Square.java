//Square extends TwoDimensionalShape
public class Square extends TwoDimensionalShape
    {
    //Attribute of square is length
    private double length;
    //contructor
    public Square(double length)
    {
        this.length=length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    //return length of the square
    public double getLengthSquare()
    {
        return length;
    }
    @Override
    public double getAreaShape()
    {
        return Math.pow(getLengthSquare(),2); //Area of Square = Length*Length
    }
    //Return string representing the TwoDimensionShape
    @Override
    public String toString()
    {
        return String.format("%sLength: %.2f\n", super.toString(),getLengthSquare());
    }
}