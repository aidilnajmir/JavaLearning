//Triangle extends TwoDimensionalShape
public class Triangle extends TwoDimensionalShape
{
    //Attribute of triangle is Base and Height
    private double base;
    private double height;
    public Triangle (double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    //contructor
    public void setBaseTriangle(double base)
    {
        this.base=base;
    }
    //return base of the triangle
    public double getBaseTriangle()
    {
        return base;
    }
    public void setHeightTriangle(double height)
    {
        this.height=height;
    }
    //return height of the triangle
    public double getHeightTriangle()
    {
        return height;
    }
    @Override
    public double getAreaShape()
    {
        return (getBaseTriangle()*getHeightTriangle())/2; // Area of Triangle = (Base*Height)/2
    }
    //Return string representing the TwoDimensionalShape
    @Override
    public String toString()
    {
        return String.format("%sBase: %.2f\nHeight: %.2f\n", super.toString(),getBaseTriangle(),getHeightTriangle());
    }
}