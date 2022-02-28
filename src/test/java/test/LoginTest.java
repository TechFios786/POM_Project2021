package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	//login data 
	String userName = "demo@techfios.com";
	String password = "abc123";
	@Test
	public void validUserShouldBeAbleToLogIn() {
		
		
		driver = BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassword(password);
		loginpage.clickSignInButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboardheader();
		dashboard.clickCustomerButton();
		BrowserFactory.tearDown();
		
	}

}
