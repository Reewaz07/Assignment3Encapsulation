
package CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
	
	public static void main(String[] args) {
		
		
	//Set<String> set= new HashSet<>();
	Set<String> set= new TreeSet<>();
	
	set.add("Ram");
	set.add("Shyam");
	set.add("hira");
	set.add("Ram");
	set.add("hira");
	for(String s:set) {
		System.out.println(s);
		
	}
	}
	

}
