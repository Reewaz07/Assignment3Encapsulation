package hmrk;

public class TriangleService {
	public float CalculateArea(Triangle triangle) {
		return triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
	}

	public void TraingleType(Triangle triangle) {
		float side1 = triangle.getSide1();
		float side2 = triangle.getSide2();
		float side3 = triangle.getSide3();

		if (side1 == side2 && side2 == side3) {
			System.out.println("The traingle is Isoceles");
		} else if ((side1 == side2) && side2 == side3) {
			System.out.println("the traingle is Equilateral");
		} else if (side3 == Math.sqrt(side2 * side2 + side1 * side1)) {
			System.out.println("The traingle is right angle");
		} else {
			System.out.println("the triangle is scalane");
		}
	}

	double areaTraingle(Triangle triangle) {
	  double s = (triangle.getSide1() + triangle.getSide2() + triangle.getSide3()) / 2;
	  return Math.sqrt(s * (s - triangle.getSide1()) * (s - triangle.getSide2()) * (s - triangle.getSide3()));
	}
}
