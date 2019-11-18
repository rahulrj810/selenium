package chennai;

import java.util.ArrayList;
import java.util.HashMap;

public class List_TO_map {
	public static void main(String args[]) {
		
		ArrayList<String> array= new ArrayList<String>();
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		array.add("rahul");
		array.add("rahul");
		array.add("rahul");
		array.add("rahul");
		int i=1;
		 
		for(String obj:array ) {
			
			map.put(i, obj);
			i++;
		}
		System.out.println(map);
		
		
	}

}
