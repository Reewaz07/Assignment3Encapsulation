package Revison;

public class ArrayOutofBoundIndex {

		public static void main(String[] args) {
			int num[]= {1,2,3,4,5};
			
			int sum=0;
			try {
				for(int i=0;i<=num.length+2;i++) {
					sum=sum+num[i];
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				e.getMessage();
			}
			
			
			System.out.println("sum:"+sum);

	}
	}
