package week2.day2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnMultipleElements {

	public static void main(String[] args) throws MalformedURLException {
		/*
		 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 * ChromeDriver driver = new ChromeDriver();
		 */
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
		dc.setVersion("80.01");
		
		RemoteWebDriver driver = new RemoteWebDriver
				(new URL("http://localhost:4444"),dc);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		driver.findElementByName("q").sendKeys("apple iphone",Keys.ENTER);
		
		List<WebElement> phones = driver.findElementsByClassName("_3wU53n");
		
		
		
		for (int i = 0; i < phones.size(); i++) {
			System.out.println(phones.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String text = phones.get(0).getText(); System.out.println(text);
		 */
		
	}

}
