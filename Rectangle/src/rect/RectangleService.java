package rect;

public class RectangleService {
	
	public float findArea(Rectangle rect) {
		float area=rect.getLength()*rect.getBreadth();
		return area;
		

	}
	public float findPerimeter(Rectangle recta) {
		float perimeter=2*(recta.getLength()*recta.getBreadth());
		return perimeter;

	}
}
