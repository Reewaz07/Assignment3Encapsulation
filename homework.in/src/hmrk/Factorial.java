package hmrk;

import java.util.Scanner;

public class Factorial {
	public int getFactorial(int num) {
		int factorial = 1;
		for (int i = num; i>0; i--) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = scanner.nextInt();
		
		Factorial obj = new Factorial();
		
		int result = obj.getFactorial(num);
		System.out.println("Factorial :" + result);

	}

}
