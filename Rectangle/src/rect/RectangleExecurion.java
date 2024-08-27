package rect;

public class RectangleExecurion {

	public static void main(String[] args) {

		RectangleIO rio = new RectangleIO();
		RectangleService rs = new RectangleService();
		
		System.out.println("Enter the value of length: ");
		System.out.println("Enter the value of breadth: ");

		Rectangle rect = rio.readRectangle();
		float Area = rs.findArea(rect);
		System.out.println("The area of the rectnagle is  : " + Area);
		float Perimeter = rs.findPerimeter(rect);
		System.out.println("The perimeter of the rectangle is :  " + Perimeter);

	}

}
