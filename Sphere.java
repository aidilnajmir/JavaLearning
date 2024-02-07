//Sphere extends ThreeDimensionalShape
public class Sphere extends ThreeDimensionalShape
{
    //Attribute of sphere is radius
    private double radius;
    //Constructor
    public Sphere(double radius)
    {
        this.radius=radius;
    }
    public void setRadiusSphere(double radius)
    {
    this.radius=radius;
    }
    //return radius of the sphere
    public double getRadiusSphere()
    {
        return radius;
    }
    @Override
    public double getVolumeShape()
    {
        return Math.PI*Math.pow(getRadiusSphere(),3)*4/3;// Volume of Sphere = 4/3(PI)(Radius^3)
    }
    @Override
    public double getSurfaceArea()
    {
        return Math.PI*Math.pow(getRadiusSphere(),2)*4;//Surface Area of Sphere = 4PI(Radius^2)
    }
    //Return string representing the ThreeDimensionShape
    @Override
    public String toString()
    {
        return String.format("%sRadius: %.2f\n", super.toString(),getRadiusSphere());
    }
}