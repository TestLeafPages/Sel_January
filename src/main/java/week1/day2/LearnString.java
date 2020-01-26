package week1.day2;

public class LearnString {
public static void main(String[] args) {
	// To Declare a String - literal
	String str1 = "Welcome to Testleaf";
	String str2 = "testleaf";
//	System.out.println(str1==str2);
	// To Declare a String - Object
	String str3 = new String("Testleaf");
//	System.out.println(str1==str3);
	
	/*To Compare two Strings - exact match
	System.out.println(str1.equals(str3));
	
	To compare two String ignoring case sensitivity
	System.out.println(str1.equalsIgnoreCase(str2));
	
	To verify weather a part of a String is available
	System.out.println(str1.contains("Test"));
	
	To get the length of the string
	System.out.println(str1.length());
	
	To take a part of a String from the original String
	System.out.println(str1.substring(4));
	System.out.println(str1.substring(0, 4));
	
	To change the case into uppercase
	System.out.println(str1.toUpperCase());
	
	To change the case into lowercase
	System.out.println(str1.toLowerCase());
	
	System.out.println(str1);
	To remove the space in the front and back of the String
	System.out.println(str1.trim());
	
		To take single character from a String
	for (int i = str1.length()-1 ; i >= 0 ; i--) {
	System.out.println(str1.charAt(i));
}
	
	To convert the String into array of characters
	char[] array = str1.toCharArray();
	for (char eachChar : array) {
		System.out.println(eachChar);
	}
	
	
	To remove the space between the String
	System.out.println(str1.replaceAll(" ",""));
	System.out.println(str1.replace('e', '$')); */
	
	String[] words = str1.split(" ");
	for (String eachWord : words) {
		System.out.println(eachWord);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
