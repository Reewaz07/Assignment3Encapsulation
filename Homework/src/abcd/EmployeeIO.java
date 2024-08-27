package abcd;

import java.util.Scanner;

public class EmployeeIO {
	Scanner sc=new Scanner(System.in);
	
	public Employee readEmployee() {
		short id=sc.nextShort();
		String name=sc.nextLine();
		float salary=sc.nextFloat();
		boolean active=sc.nextBoolean();
		Employee emp= new Employee(id,name,salary,active);
		return emp;	
	}
	public void displayEmployee(Employee emps) {
		//Employee emps=new Employee();
		System.out.println(emps);
		
	}
	public Employee readEmployee(int length) {
		return null;
		
		
	}

}
