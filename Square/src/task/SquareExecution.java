package task;

public class SquareExecution {
	public static void main(String[] args) {
		
		SquareIO squareio=new SquareIO();
		SquareArea squarearea=new SquareArea();
		System.out.println("Enter the value of the length :");
		Square square= squareio.readSquare();
		float area=squarearea.findArea(square);
		System.out.println("The area of the square is :"+area);
		
		
		
		
		
		
		
		
		
		
		
		
		//   float area=squarearea.findArea(square);
		 //  System.out.println("The area of the square is: "+area);
		    
		    
		
		
		
		
		
		
		
		//System.out.println("the area of the square is : "+area);
		
		
	}
	

}
