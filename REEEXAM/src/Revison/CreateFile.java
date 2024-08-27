package Revison;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
public static void main(String[] args) throws IOException {
	File obj= new File("C:\\Users\\abc.txt");
	if(obj.createNewFile()) {
		System.out.println("File created");
	}else {
		System.out.println("File already exiest");
	}
}
}
