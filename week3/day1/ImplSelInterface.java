package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ImplSelInterface implements SelInterface{
	public RemoteWebDriver driver;
	public void launchBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"./drivers/firefoxdriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void enterValue(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
	}
	
	
}
