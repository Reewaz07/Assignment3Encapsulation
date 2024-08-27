package Level1;

import java.util.Scanner;

public class Area {
	
	int length;
	int breadth;
	
	public void SetDim(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
			
	}
    public void getArea() {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the value of length");
	  int length=sc.nextInt() ;
	 System.out.println("enter the value of breadth :");
	 
	  int breadth=sc.nextInt();
	  int area=length*breadth;
	  System.out.println("The area of the rectangle is "+area);
	 	    
  }
  public static void main(String[] args) {
	Area obj=new Area();
	obj.getArea();
	
}
}
