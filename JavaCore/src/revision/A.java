package revision;
//SUper Keyword
 class A {
int x=500;

}
class B extends A{
	int x=700;
	void print() {
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.print();
	}
}

