package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnDevTools {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*
		 * driver.switchTo().newWindow(WindowType.WINDOW);
		 * System.out.println(driver.getCurrentUrl());
		 * driver.navigate().to("https://www.google.com/");
		 */		
		/*
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * 
		 * System.out.println(driver.getCurrentUrl());
		 
		
		System.out.println(driver.findElement(RelativeLocator.withTagName("li").
				toLeftOf(By.xpath("//ul[@class='wp-categories-list']/li[8]"))
				.below(By.xpath("//ul[@class='wp-categories-list']/li[1]"))).getText());*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
