package Revison;
class Bank{
	 public void Interest() {
		System.out.println("Interest is 5%");
	}
}

public class MethodOverridinh extends Bank{
	public void Interest() {
	System.out.println("Interest of NIC is 7%");
	}
	
public static void main(String[] args) {
	MethodOverridinh obj=new MethodOverridinh();
	obj.Interest();
	
	}
}
