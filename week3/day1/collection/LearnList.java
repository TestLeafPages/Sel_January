package week3.day1.collection;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
//		String[] names = new String[5];
		List<String> names = new ArrayList<>();
		names.add("Balaji");
		names.add("Sam");
		names.add("Naveen");
		names.add("Hari");
		names.add("Sarath");
		names.add("Rasheed");
		names.add("Sam");
		System.out.println("Size "+names.size());
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.remove("Sam");
		System.out.println("**************");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println(names.contains("Sam"));
		
		names.clear();
		System.out.println(names.isEmpty());
		
		
		
		
		
		
		
		
		
		/*System.out.println("*******************");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
