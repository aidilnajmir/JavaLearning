//Circle extends TwoDimensionalShape
public class Circle extends TwoDimensionalShape
{
    //Attribute of circle is Radius
    private double radius;
    //constructor
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double getRadiusCircle()
    {
        return radius;
    }
    //return double representation of Circle object
    @Override
    public double getAreaShape()
    {
        return Math.PI*Math.pow(getRadiusCircle(),2); //Area of Circle = PI(Radius^2)
    }
    //Return string representing the TwoDimensionalShape
    @Override
    public String toString()
    {
        return String.format("%sRadius: %.2f\n", super.toString(),getRadiusCircle());
    }
}