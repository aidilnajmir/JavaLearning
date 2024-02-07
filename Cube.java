//Cube extends ThreeDimensionalShape
public class Cube extends ThreeDimensionalShape
{
    //Attribute of cube is length
    private double length;
    //Constructor
    public Cube(double length)
    {
        this.length=length;
    }
    public void setLengthCube(double length)
    {
        this.length=length;
    }
    //return length of the cube
    public double getLengthCube()
    {
        return length;
    }
    @Override
    public double getVolumeShape()
    {
        return Math.pow(getLengthCube(),3); //Volume of Cube = Radius^3
    }
    @Override
    public double getSurfaceArea()
    {
        return Math.pow(getLengthCube(),2)*6; //Surface Area of Cube = 6(Length^2)
    }
    //Return string representing the ThreeDimensionShape
    @Override
    public String toString()
    {
        return String.format("%sLength: %.2f\n", super.toString(),getLengthCube());
    }
}