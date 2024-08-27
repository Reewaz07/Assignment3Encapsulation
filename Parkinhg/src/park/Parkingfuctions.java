package park;

public class Parkingfuctions {
	
	public boolean toPark(int[]ParkingSpace) {
		for(int i=0;i<ParkingSpace.length;i++) {
			
			if(ParkingSpace[i]==0) {
				return true;
			}
			
		}
		
		
	return false;
		
		
		
	}

}
