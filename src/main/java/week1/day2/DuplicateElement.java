package week1.day2;

import java.util.Arrays;

public class DuplicateElement {
	public static void main(String[] args) {

		int[] array = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Arrays.sort(array);
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]==array[i+1]) {
				System.out.println("Duplicate Value: "+array[i]);
			}
		}
		
		
		
		
		
		
		
		
	
	}
}
