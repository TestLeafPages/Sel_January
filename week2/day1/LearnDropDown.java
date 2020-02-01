package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dropDown = new Select(marketing);
//		dropDown.selectByVisibleText("Car and Driver");
		dropDown.selectByValue("DEMO_MKTG_CAMP");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dropDown2 = new Select(source);
//		dropDown2.selectByValue("LEAD_CONFERENCE");
		List<WebElement> allOptions = dropDown2.getOptions();
		System.out.println(allOptions.size());
		dropDown2.selectByIndex(allOptions.size()-1);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
