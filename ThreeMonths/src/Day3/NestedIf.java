package Day3;

public class NestedIf {
	
	public static void main(String[] args) {
		String citizen= "Nepali";
		int Age=30;
		boolean havevoterId=true;
		
		if(citizen.equals("Nepali")) {
			if(Age>=18) {
				if(havevoterId){
					System.out.println("thank you for the vote");
				else{
					System.out.println("You dont have voterID");   
				}
		}
		else {
			System.out.println("You are not eligible to vote");
		}
	}

}
