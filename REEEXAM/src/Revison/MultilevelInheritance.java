package Revison;

class Apple{
	void print() {
		System.out.println("This is a class A");
	}
}
class Ball extends Apple{
	void printB() {
		System.out.println("THis is a class B");		
	}	
}
public class MultilevelInheritance extends Ball {
	void printC() {
		System.out.println("this ia a class C");
		
	}

	public static void main(String[] args) {
		MultilevelInheritance obj= new MultilevelInheritance();
		obj.print();
		obj.printB();
		obj.printC();
	}
		
		
	}

