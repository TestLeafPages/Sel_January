package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="username") WebElement eleUserName;
	public LoginPage enterUsername(String data) {
		eleUserName.sendKeys(data);
		return this;
	}
	@FindBy(how=How.ID, using="password") WebElement elePass;
	public LoginPage enterPassword(String data) {
		elePass.sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
	
	
	
	
	
	
	

}
