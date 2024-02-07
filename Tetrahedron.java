//Tetrahedron extends ThreeDimensionalShape
public class Tetrahedron extends ThreeDimensionalShape
{
    //Attribute of tetrahedron is edge
    private double edge;
    //Constructor
    public Tetrahedron (double edge)
    {
        this.edge=edge;
    }
    public void setEdgeTetradron(double edge)
    {
        this.edge=edge;
    }
    //return edge of the tetrahedron
    public double getEdgeTetradron()
    {
        return edge;
    }
    @Override
    public double getVolumeShape()
    {
        return Math.pow(getEdgeTetradron(),3)/(6* Math.sqrt(2));
    //Volume of Tetrahedron = (Edge^3)/(6*Squareroot(2)
    }
    @Override
    public double getSurfaceArea()
    {
        return Math.sqrt(3)*Math.pow(getEdgeTetradron(),2);// Surface Area of Tetrahedron = (squareroot(3))(Edge^2)
    }
    //Return string representing the ThreeDimensionShape
    @Override
    public String toString()
    {
        return String.format("%sEdge: %.2f\n", super.toString(),getEdgeTetradron());
    }
}