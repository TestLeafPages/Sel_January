package week3.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		SelInterface obj = new ImplSelInterface();
		obj.launchBrowser("chrome", "http://leaftaps.com/opentaps/control/main");
		obj.enterValue("username", "demosalesmanager");
		obj.enterValue("password", "crmsfa");
		

		
	}
	
	
}
