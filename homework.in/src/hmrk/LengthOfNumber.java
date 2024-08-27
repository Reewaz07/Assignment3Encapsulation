package hmrk;

import java.util.Scanner;

public class LengthOfNumber {
	public int Nomber(int num) {
		return String.valueOf(num).length();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		LengthOfNumber obj = new LengthOfNumber();
		int number = obj.Nomber(num);
		System.out.println("The length of the number is" + number);
	}

}
