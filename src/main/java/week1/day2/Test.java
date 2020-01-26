package week1.day2;

public class Test {


	public void sample(String[] str) {
		int a = 5;
		try {
			for (int i = 0; i < str.length; i++) {
				System.out.println(Integer.parseInt(str[i])/0);
			}
		} catch (ArithmeticException e) {
			System.out.println("Zero Division Error");
		} catch(Exception e) {
			System.out.println("Unknown Exception");
		}
	}


	public static void main(String[] args) {
	Test test = new Test();
	String[] input = {"10","18","Balaji"};
	test.sample(input);
	}

}




