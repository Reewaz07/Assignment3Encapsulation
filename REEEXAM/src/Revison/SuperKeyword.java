package Revison;

 class SuperKeyword {
	int x = 100;
}
class Z extends SuperKeyword {
	int x = 200;

	void print() {
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		 Z obj = new Z();
		obj.print();

	}
}
