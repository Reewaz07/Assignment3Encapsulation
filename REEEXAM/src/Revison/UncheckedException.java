package Revison;

public class UncheckedException {
	public static void main(String[] args) {
		try {
		int a=100;
		int b=0;
		int c= a/b;
		System.out.println(c);
		}catch (Exception e)
		{ 
			System.out.println(e);
		}	
	}
}
