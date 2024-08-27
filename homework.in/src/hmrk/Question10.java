package hmrk;

import java.util.Scanner;

public class Question10 {
	
	public void display(int start,int end) {
		
		for(int i=start;i<=end;i++) {
			System.out.println(i);			
		}	
	}
	
	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start=sc.nextInt();	
	
		System.out.println("Enter the ending number");
		int end=sc.nextInt();
		
		Question10 obj=new Question10();
		obj.display(start, end);
			}

}
