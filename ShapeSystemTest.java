//Tests shape system
public class ShapeSystemTest
{
    public static void main (String args[])
    {
        //sets value for components of shape
        Shape shape[] = new Shape[6];
        shape[0] = new Circle(8.0);
        shape[1] = new Square(6.0);
        shape[2] = new Triangle(6.0,7.0);
        shape[3] = new Sphere(3.0);
        shape[4] = new Cube (5.0);
        shape[5] = new Tetrahedron(7.0);
        
        for (Shape fixedShape : shape)
            
            if(fixedShape instanceof TwoDimensionalShape)
            {
            TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) fixedShape;
            System.out.printf("Two Dimensional Shape : %sArea: %.2f\n\n", twoDimensionalShape.toString(), twoDimensionalShape.getAreaShape());
            //output the name of Shape, Area of Shape
            }
            
            else if(fixedShape instanceof ThreeDimensionalShape)
            {
            ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) fixedShape;
            System.out.printf("Three Dimensional Shape : %sSurface Area: %.2f\nVolume: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getSurfaceArea(),threeDimensionalShape.getVolumeShape());
            //output the name of Shape, radius/length/edge of shape, volume of Shape, surface Area of Shape,
            }
    }
}