package Day3;

import java.util.Scanner;

public class Iftest {

	
	public static void main(String[] args) {
		
		int salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		
		salary =sc.nextInt();
		if(salary>4000) {
		salary=salary+8000;
		}
		
		System.out.println("Your total salary is" +salary);
	}
}
