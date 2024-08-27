package prov;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProvinceListReader {
	
	
	public List<Province> personListReader(){
		try {
			List<Province> provincelist=new ArrayList();
			File filesource= new File("location.csv");
			Scanner sc= new Scanner("C:/Users/thapa/Downloads/location.csv");
			String line=sc.nextLine();
			String[] lineArray=line.split(",");
			
		}
		catch(FileNotFoundException filenotfoundexception) {
		return new ArrayList<>();
		
	}
	return new ArrayList<>();
	}
}
