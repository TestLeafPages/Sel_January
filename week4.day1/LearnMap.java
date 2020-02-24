package week4.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		
//		Map<K,V> obj = new HashMap<K,V>();
		
		Map<String,Integer> obj = new HashMap<String, Integer>();
		obj.put("Sam", 98765);
		obj.put("Naveen", 786713);
		obj.put("Balaji", 889723);
		obj.put("Hari", 8907348);
		System.out.println("Size of the map is "+obj.size());
		obj.put("Sam", 8907348);
		System.out.println(obj);
		
		for(Entry<String,Integer> eachObj : obj.entrySet()) {	
			System.out.println(eachObj.getKey()+"-->"+eachObj.getValue());
//			System.out.println(eachObj.getValue());	
		}
		
		System.out.println(obj.containsKey("Sam"));
		
		System.out.println(obj.get("Sam"));
		
		obj.remove("Sam");
		System.out.println();
		for(Entry<String,Integer> eachObj : obj.entrySet()) {	
//			System.out.println();
			System.out.println(eachObj.getKey()+"-->"+eachObj.getValue());
//			System.out.println(eachObj.getValue());	
		}	
		obj.clear();
		System.out.println(obj.isEmpty());
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		/*
		 * for(String eachObj : obj) {
		 * 
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
