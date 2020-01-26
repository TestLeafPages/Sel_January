package week1.day1;

public class Car {
//				camelCase
//accessModifier returnType methodName
	public void applyBrake() {
		System.out.println("Brake is applied");
	}
	/*public void changeGear() {
	}*/
	
	
	public static void main(String[] args) {
//ClassName objName = new ClassName(); => Constructor
		Car myCar = new Car();
		myCar.applyBrake();
		
		int a = 5;
		Integer aa = 4;
		long l = 987L;
		Long l1 = new Long(1234);
		
		
		String s = "123";
		int value = Integer.parseInt(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Boolean b = new Boolean(true);
	
		Boolean isfueled = true;
		boolean isPunctured = true;
		int milage = 150000;
		long chasisNo = 987645321764537L;
		float fuelCapacity = 52.32312F;
		double engineCapacity = 3.339857567;
		int numberOfSeats = 5;
		char logo = 'S';
		String model = "Swift";
		String[] models = {"Alto","WagonR","Celerio"};
		//Switch case supports int and String
		int monthOfPurchase = 5;
		
		switch (monthOfPurchase) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("April");
			break;
		
		default:
			System.err.println("month not found");
			break;
		}
		
		// 4 or less  Sedan
		// 5 / 6   SUV
		// 6 / 7 / 8   MUV
		// > 8 to < 60   Bus
		// > 72 to < 1000   Train
		
		
		/*if(isPunctured) {
			//Positive Block
			System.out.println("Repair");
		}else {
			//Negative Block
			System.out.println("All Good");
		}
		if (milage<500) {
			System.out.println("New Car");
		} 
		else if(milage>=500 && milage<50000){
			System.out.println("Used Car");
		}
		else {
			System.out.println("Old Car");
		}*/
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
