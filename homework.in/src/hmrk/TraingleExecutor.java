package hmrk;

public class TraingleExecutor {

    public static void main(String[] args) {
        TriangleIO triangleIO = new TriangleIO();
        TriangleService triangleService = new TriangleService();
        
        System.out.println("enter the value of three sides of triangle:");
        Triangle triangle = triangleIO.readTriangle();
        
        double area = triangleService.CalculateArea(triangle);
        System.out.println("area of the triangle is:"+area);
        double perimeter = triangleService.areaTraingle(triangle);
        System.out.println("perimeter of triangle is:"+perimeter);
        triangleService.TraingleType(triangle);
    }
}