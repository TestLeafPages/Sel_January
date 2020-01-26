package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	/*
	 * Introduction to Arrays, foreach, static, ASCII Exceptions:
	 * ArrayIndexOutOfBoundsException
	 * 
	 */

	public static void main(String[] args) {
		/*
		 * Arrays is a concept used to store multiple item of same type in a single name
		 * Limitation of the array -> you have to specify the size while declaring an
		 * array
		 */
		String brand = "Suzuki";
		// to declare an array - literal
		String[] brands = { "MG", "BMW", "RR", "KIA", "CHEVY" };
		// To find size of the array
		System.out.println("Size of the array: "
							+brands.length);
		int length = brands.length;
		
		System.out.println(brands[length-1]);
		System.out.println(brands[5]);
		
		
		// To print the values in array
		/*
		 * for (int i = 0; i < brands.length; i++) { System.out.println(brands[i]); }
		 */
		
		//To sort the array
		Arrays.sort(brands);
		
		// Iterate using for each looping
//		for (String eachBrand : brands) {
//			System.out.println(eachBrand);
//		}
//
		
		
		
		
		
		
		





		// To declare an array - Object
		int[] seatCounts = new int[6];
		// To assign value in an array
		seatCounts[0] = 4;
		seatCounts[1] = 5;
		seatCounts[2] = 6;
		seatCounts[3] = 7;
		seatCounts[4] = 8;
		seatCounts[5] = 9;

	}

}
