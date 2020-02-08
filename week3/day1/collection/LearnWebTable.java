package week3.day1.collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//DataTable TrainList TrainListHeader

public class LearnWebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MDU", Keys.TAB);
		
		// Finding the table and storing the webelement
		WebElement eleTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		// Now Inside the table, try to find all the rows using findElements
		List<WebElement> tableRows = eleTable.findElements(By.tagName("tr"));
		System.out.println(tableRows.size());
		
		// To get a particular row, use get() and store it back
		WebElement firstRow = tableRows.get(0);
		
		// From the row Element, find all the columns available in the row
		List<WebElement> firstRowCols = firstRow.findElements(By.tagName("td"));
		
		// Now pick a particular column and get the text from the webElement
		System.out.println(firstRowCols.get(1).getText());
		
		
		
		
		
		
		
		
		
		
	}

}
