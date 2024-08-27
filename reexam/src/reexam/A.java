package reexam;


interface Apple{
	void print();		
	}
interface Fruit{
	void print();
	
}

class A implements Apple, Fruit {
	public void print()
	{
		System.out.println("Interace Apple and Fruit");
		
	}
public static void main(String[]args) {
	A m=new A();
	m.print();
}

	
	

}
