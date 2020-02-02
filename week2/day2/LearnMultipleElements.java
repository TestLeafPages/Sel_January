package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		driver.findElementByName("q").sendKeys("apple iphone",Keys.ENTER);
		
		List<WebElement> phones = driver.findElementsByClassName("_3wU53n");
		
		/*
		 * String text = phones.get(0).getText(); System.out.println(text);
		 */
		
		for (int i = 0; i < phones.size(); i++) {
			System.out.println(phones.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
