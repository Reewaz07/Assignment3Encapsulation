package Inheritance;

class Members {
	String name;
	int age;
	int phoneno;
	int Salary;
	String Address;

	public void Salary() {
		System.out.println("The salary of members is " + Salary);
	}
}
class Employee extends Members {
	String Specialization;

	void EmploeeInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Phone no:" + phoneno);
		System.out.println("Address :" + Address);
		System.out.println("Specialization ;" + Specialization);
		Salary();
	}

}

class Manager extends Members {
	String Department;

	void ManagerInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Phone no:" + phoneno);
		System.out.println("Address :" + Address);
		System.out.println("Department :" + Department);

		Salary();
	}

}

public class Question3{
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Reewaz";
		emp.Address = "Thali";
		emp.age = 21;
		emp.Salary = 50000;
		emp.Specialization = "Develp[er";
		emp.phoneno = 987026275;
		emp.EmploeeInfo();
		System.out.println("-----------------------------------------------------------------------------------");

		Manager mgr = new Manager();
		mgr.name = "hero";
		mgr.Address = "KTM";
		mgr.age = 30;
		mgr.Salary = 100000;
		mgr.Department = "bca";
		mgr.phoneno = 981326272;
		mgr.ManagerInfo();

	}
}
