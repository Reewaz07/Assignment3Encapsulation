package abcd;

public class Employee {
	short id;
	String fullname;
	float salary;
	boolean active;
	public Employee() {
		
	}
	
	public Employee(short id, String fullname, float salary, boolean active) {
		this.id = id;
		this.fullname = fullname;
		this.salary = salary;
		this.active = active;
	}
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	

}
