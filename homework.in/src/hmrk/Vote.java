package hmrk;

import java.util.Scanner;

public class Vote {
	public void toVote() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the age of the person:");
		int age=scanner.nextInt();
		
		if(age<17) {
			System.out.println("the person is not eligible to vote");
		}
		else {
			System.out.println("the person is eligible to vote");
		}
	}
public static void main(String[] args) {
	Vote obj=new Vote();
	obj.toVote();

}
}
