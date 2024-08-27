package Revison;

interface A{
	public void print();
	
}
interface B{
	public void print();
	
}

public class MultipleInheritance implements A,B{
	 public void print() {
	    System.out.println("interfaces A and B");
	    }

	
		public static void main(String[] args) {
			MultipleInheritance obj=new MultipleInheritance();
			//System.out.println("A and B");
			obj.print();
		}
		}
		
		
	


