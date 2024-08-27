package hmrk;

import java.util.Scanner;

public class GreatesNumber {
	public void averageNumber(int num1,int num2,int num3) {
		if(num1>num2 && num1>num3) {
			System.out.println("Number1 is greater among 3 numbers");
		}
		
		
		else if (num2>num1&& num2>num3)
		    {
				System.out.println("Number 2 is greater among 3 numbers");
			}
		else 
		{
			System.out.println("Number 3 is greater among 3 numbers");
		}
		
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of num 1");
	int num1=sc.nextInt();
	System.out.println("Enter the value of num 2");
	int num2=sc.nextInt();
	System.out.println("Enter the value of num 3");
	int num3=sc.nextInt();
	  
	GreatesNumber obj=new GreatesNumber();
	obj.averageNumber(num1, num2, num3);
	

}
}
