package hmrk;

import java.util.Scanner;

public class EvenOrOdd {
	public void Even() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("the number is odd");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		//EvenOrOdd obj=new EvenOrOdd();
		//obj.numb();
		
	}
}
