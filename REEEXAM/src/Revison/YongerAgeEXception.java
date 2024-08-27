package Revison;
//example of throw
//custom exception example 
import java.util.Scanner;

public class YongerAgeEXception extends RuntimeException {
	YongerAgeEXception(String msg) {
		super(msg);
	}
}
class Voting{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age :");
int Age=sc.nextInt();
		if (Age<18)
		{
		 throw new YongerAgeEXception("You are not eligible for voting");
        }
    else{
		 System.out.println("you can vote");
	    }
	}
}
