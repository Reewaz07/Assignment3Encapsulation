package rect;

import java.util.Scanner;

public class RectangleIO {
	
	public Rectangle readRectangle() {
	
	Scanner sc= new Scanner(System.in);
     float length=sc.nextFloat();
     float breadth=sc.nextFloat();
     
     Rectangle rect=new Rectangle(length,breadth);
	return rect;
	}

}
