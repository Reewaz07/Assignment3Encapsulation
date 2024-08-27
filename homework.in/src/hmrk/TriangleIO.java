package hmrk;

import java.util.Scanner;


public class TriangleIO {
	
	 Scanner sc= new Scanner(System.in);
	 public Triangle readTriangle() {
		 float side1=sc.nextFloat();
		 float side2=sc.nextFloat();
		 float side3=sc.nextFloat();
		 Triangle triangle = new Triangle(side1,side2,side3);
	        return triangle;
	
	
}
		

}
