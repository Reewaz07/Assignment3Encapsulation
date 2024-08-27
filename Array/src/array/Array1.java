package array;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {

		int size;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		size = sc.nextInt();
		System.out.println("Enter the elemenst of array");
		
		int a[] = new int[size];
		for (i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Printed Array elements:");
		for (i = 0; i <size; i++)
		{
		System.out.println(a[i]);
	}
	}
}
