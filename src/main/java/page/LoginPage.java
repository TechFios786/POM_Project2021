package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_ELEMETN;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMETN;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_ELEMENT;
	
	



	public  void insertUserName(String userName) {
		USERNAME_ELEMETN.sendKeys(userName);
		
	}
	public void insertPassword(String password) {
		PASSWORD_ELEMETN.sendKeys(password);
	}
	public void clickSignInButton() {
		SIGNIN_ELEMENT.click();
	}
	
}
	
	
	