package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String> list= new ArrayList();
		List<String> list =new LinkedList();
		
		list.add("Nepal");
		list.add("India");
		list.add("china");
		list.add("japan");
		
		System.out.println(list.contains("china"));
		list.remove("India");
		list.remove(3);
		
		for(String s:list) {
			System.out.println(s);
		}
		
	} 


}
