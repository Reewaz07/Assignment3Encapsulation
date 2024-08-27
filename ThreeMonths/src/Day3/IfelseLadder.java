package Day3;

import java.util.Scanner;

public class IfelseLadder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the marks5");
		int marks=sc.nextInt();
		
		if(marks>=80) {
			System.out.println("distinction");
		}
		else if(marks>=60) {
			System.out.println("1st Division");
			
		}
		else if(marks>=40) {
			System.out.println("2nd Division");
			
		}
		else{ 
			System.out.println("Fail");
			
		}
	} 

}
