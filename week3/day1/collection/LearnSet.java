package week3.day1.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
public static void main(String[] args) {
	Set<String> names = new LinkedHashSet<>();
	names.add("Balaji");
	names.add("Sam");
	names.add("Naveen");
	names.add("Hari");
	names.add("Sarath");
	names.add("Rasheed");
	for (String eachName : names) {
		System.out.println(eachName);
	}
	names.add("Hari");
	System.out.println("*****************");
	for (String eachName : names) {
		System.out.println(eachName);
	}
	
	
	
	
	
	
	
	
	
}
}
