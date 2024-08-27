package Revison;
public class ThisKeyword {
	int l;
	int b;
	// Constructor to initialize l and b
	void print(int l, int b) {
		this.l = l;
		this.b = b;
	}
	// Method to print the area
	void printArea() {
		int area = l * b;
		System.out.println(area);
	}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.printArea();
	}
}
