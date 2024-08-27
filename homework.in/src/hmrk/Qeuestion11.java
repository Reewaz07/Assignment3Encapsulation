package hmrk;

import java.util.Scanner;

public class Qeuestion11 {

		
		public void show(int begin,int finish) {
			
			for(int i=begin;i<=finish;i++) {
				if(i%2!=0) {
				System.out.println("Odd Numbers are: "+i);			
			}	
		}
		}
		public static void main(String[] args) {
			
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the starting number");
			int start=sc.nextInt();	
		
			System.out.println("Enter the ending number");
			int end=sc.nextInt();
			
			Qeuestion11 obj=new Qeuestion11();
			obj.show(start, end);
				}

	}


