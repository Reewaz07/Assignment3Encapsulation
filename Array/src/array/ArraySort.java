package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
		}
		
			Arrays.sort(a);
			System.out.println(" The sorted arrays are:  ");
		for(int i=0;i<a.length;i++) {		
			System.out.println( a[i]);
			
		}
	}

}
