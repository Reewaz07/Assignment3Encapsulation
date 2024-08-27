package hmrk;

public  class Sum {
	public int getTotal(int x,int y) {
	int sum=x+y;
	return sum;
	
}
	public static void main(String[] args) {
		Sum obj=new Sum();
		int total=obj.getTotal(5, 7);
		System.out.println("the sum is:"+total);
		
	}
}
