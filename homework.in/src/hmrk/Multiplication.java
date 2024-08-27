package hmrk;

import java.util.Scanner;

public class Multiplication {
	public void multiply(int x) {
		
	for(int i=1;i<=10;i++) {	
		System.out.println(x+"*"+i+"="+x*i);
	}
		
	}
	
	

	
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want the multiplication table of;");
		int x=sc.nextInt();
		
		Multiplication obj= new Multiplication();
		obj.multiply(x);
	}
}
