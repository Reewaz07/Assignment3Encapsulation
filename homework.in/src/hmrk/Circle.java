package hmrk;

import java.util.Scanner;

public class Circle {
	public double areaofCircle(int r ) {
		return Math.PI*r*r;
	}
		public double circumofCircle(int r) {
			return 2*Math.PI*r;
			
	}
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the value of radius:");
		
		int r =scanner.nextInt();
		
		 Circle obj=new Circle();
		 double area = obj.areaofCircle(r);
		 
		 System.out.println("The area of circle is"+area);
		 double circumference=obj.circumofCircle(r);
		 System.out.println("the circumference of circle is:"+circumference);
		 
	}
}
