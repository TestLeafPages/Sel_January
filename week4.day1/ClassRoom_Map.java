package week4.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom_Map {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		Map<String,String> map = new HashMap<String, String>();
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		for (WebElement eachRow : allRows) {
			List<WebElement> col = eachRow.findElements(By.tagName("td"));
			if(col.get(1).getText().startsWith("m")) {
			map.put(col.get(0).getText(), col.get(1).getText());
			}
		}
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * for(Entry<String,Integer> eachObj : obj.entrySet()) {
		 * System.out.println(eachObj.getKey()+"-->"+eachObj.getValue()); //
		 * System.out.println(eachObj.getValue()); }
		 */
		
		
		
	}

}
