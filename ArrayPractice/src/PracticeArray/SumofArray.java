package PracticeArray;

public class SumofArray {
	public static void main(String[] args) {
		int sum = 0;
		int arr[]= {5,9,1,5,2,7};
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum is "+sum);
	}

}
