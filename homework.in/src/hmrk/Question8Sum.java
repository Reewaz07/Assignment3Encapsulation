package hmrk;

import java.util.Scanner;

public class Question8Sum {
	public int sumOf(int num1,int num2,int num3) {
		int total=num1+num2+num3;
		return total;

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		
		System.out.println("Enter num3");
		int num3=sc.nextInt();
		
		Question8Sum obj=new Question8Sum();
		int tot=obj.sumOf(num1,num2,num3);
		System.out.println("the sum is :"+tot);
		
		
	}
}
