package Level1;

public class Student {
	
	
	public void studentInfo() {
		String Name="John";
		int Roll_no=2;
		System.out.println("Name :"+Name);
		System.out.println("Roll number :"+Roll_no);
	}
	public static void main(String[] args) {
		Student stdnt= new Student();
		stdnt.studentInfo();
	}

}
