package task;

import java.util.Scanner;

public class SquareIO {

	Scanner sc = new Scanner(System.in);

	public Square readSquare() {
		float length = sc.nextFloat();
		//square.setLength(length);
	   //method 1 square.setLength(length);
		 Square sqr = new Square(length);
		return sqr;
	
	}
}
