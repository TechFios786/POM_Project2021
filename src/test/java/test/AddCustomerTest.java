package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	//login data 
		String userName = "demo@techfios.com";
		String password = "abc123";
	@Test
	public void validUserShouldBeAbleToCreateCustomer() throws InterruptedException {
		driver= BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardheader();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContantPage();
		addCustomerPage.insertFullName("Selenium Sept2021");
		addCustomerPage.insertcompanyDropDown("Techfios");
		addCustomerPage.insertEmail("abc@techfios.com");
		addCustomerPage.insertPhone("7572321563");
		addCustomerPage.insertAddress("texas-Fort Worth");
		addCustomerPage.insertCity("Kabul");
		addCustomerPage.insertState("Texas");
		addCustomerPage.insertZip("76179");
		addCustomerPage.insertCountry("Uganda");
		addCustomerPage.insertTag("tag");
		addCustomerPage.clickSubmitButton();
	}

}
