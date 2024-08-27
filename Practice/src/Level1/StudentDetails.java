package Level1;

public class StudentDetails {
	int rollno;
	int phoneno;
	String name;
	String address;
	
	public StudentDetails(int rollno, int phoneno, String name, String address) {

		this.rollno = rollno;
		this.phoneno = phoneno;
		this.name = name;
		this.address = address;
	}
	public void printStudent() {
		System.out.println("Roll No: " + rollno);
		System.out.println("Phone: " + phoneno);
	    System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails(1,981346262,"Sam","Thali");
		sd.printStudent();
		StudentDetails sd1=new StudentDetails(2,981757339,"Jhon","india");
		sd1.printStudent();
		
		
	}
}
