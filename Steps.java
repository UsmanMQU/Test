package Mavens.Teatest;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
	import cucumber.api.java.After;
	import cucumber.api.java.Before;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Steps 
	{
		public String urlLogin = "";
		public String urlPim = "";
		public String urladd = "";
		static String idd = "5565"; //increment by 1 every run
		WebDriver driver;
		static String a;
		ExtentTest test;
		ExtentReports report = new ExtentReports("C:\\Users\\Admin\\Desktop\\Examinationfinal.html", true);
		String user = "Admin";
		String pass = "AdminAdmin";
		@Before
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			test = report.startTest("Verify application");
			driver.get("https://qa-trials641.orangehrmlive.com/auth/login");		
			
	
		}
		
		@Given("^the login page$")
		public void the_login_page() throws Throwable 
		{
		 	Page1 login = PageFactory.initElements(driver, Page1.class);
			login.logging(user, pass);
			urlLogin = driver.getCurrentUrl();		
		}

		@When("^I login$")
		public void i_login() throws Throwable 
		{
			System.out.println("lgin");
			String compare1 = "Jacqueline White";
			String compare2 = "h";
			compare2 = driver.findElement(By.id("account-name")).getText();
			if(compare2.equals(compare1))
			{
				test.log(LogStatus.PASS, "Login achieved");
			}
			else
			{
				test.log(LogStatus.FAIL, "Login has not achieved");
			}
			
			assertEquals(compare2, compare1);
		}

		@When("^I click the PIM tab$")
		public void i_click_the_PIM_tab() throws Throwable 
		{
			driver.getCurrentUrl();
			Page2 users = PageFactory.initElements(driver, Page2.class);
			users.Employee();
			Thread.sleep(1000);
			//Couldn't really do anymore logs/tests because user count reached.
		    
		}

		@When("^then the Add Employee Tab$")
		public void then_the_Add_Employee_Tab() throws Throwable
		{	
			driver.getCurrentUrl();
			Page2 users1 = PageFactory.initElements(driver, Page2.class);
			users1.addU();
			Thread.sleep(21000);
		   
		}

		@When("^I fill out the Add Employee Details correctly$")
		public void i_fill_out_the_Add_Employee_Details_correctly() throws Throwable {
			driver.getCurrentUrl();
			Page2 details = PageFactory.initElements(driver, Page2.class);
			details.info(driver, idd);
			Thread.sleep(3000);
			
		}

		@When("^I choose to create Login Details by clicking the appropriate button$")
		public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() throws Throwable
		{
			driver.getCurrentUrl();
			Page2 clickB = PageFactory.initElements(driver, Page2.class);
			clickB.boxC();
			Thread.sleep(2000);
			
		}

		@When("^I fill out the Login Details correctly$")
		public void i_fill_out_the_Login_Details_correctly() throws Throwable 
		{
			driver.getCurrentUrl();
			Page2 moredetails = PageFactory.initElements(driver, Page2.class);
			moredetails.moreinfo();
			Thread.sleep(5000);
		  
		}

		@When("^I click the Save button$")
		public void i_click_the_Save_button() throws Throwable {
			driver.getCurrentUrl();
			Page2 save = PageFactory.initElements(driver, Page2.class);
			save.saveB();
			Thread.sleep(22000);
		   
		}

		@Then("^I can search for the Employee I have just created$")
		public void i_can_search_for_the_Employee_I_have_just_created() throws Throwable
		{
			driver.getCurrentUrl();
			Page3 search = PageFactory.initElements(driver, Page3.class);
			search.find(idd);
			Thread.sleep(7000);
		}

		@Then("^select them for inspection$")
		public void select_them_for_inspection() throws Throwable {
		
			//Only part I didn't get to, would not have compelted it even if users didn't reach max limit.
		}

		@After
		public void teardown()
		{
			report.endTest(test);
			report.flush();
			driver.quit();
		}
	
	
	}
