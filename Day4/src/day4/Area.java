package day4;

import java.util.Scanner;

public class Area {
	int Area(int x,int y) {
	int z=x*y;
	return z;
	}
	int Volume(int a) {
		return a*a*a;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of x");
	
	int x=sc.nextInt();
	System.out.println("enter the value of y: ");
	int y= sc.nextInt();
	Area area= new Area();
	int z=area.Area(x,y);
	System.out.println("The area is "+z);
	
}

}
