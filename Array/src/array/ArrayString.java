package array;

import java.util.Arrays;

public class ArrayString {
	
public static void main(String[] args) {
	
	
	String array[]= {"Reewaz","Thapa","BCA","texas"};
	
	System.out.println("To string method"+Arrays.toString(array));
	System.out.println("as list"+Arrays.asList(array));
	
	
	int arr[][]= {{2,3,4},{4,5,6}};
	System.out.println(Arrays.deepToString(arr));


}
}
