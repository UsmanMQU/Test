package Mavens.Teatest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.dynamic.scaffold.FieldRegistry;

public class Page2 
{
	String a = "";
	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement pim;
	@FindBy(id = "menu_pim_addEmployee") 
	private WebElement add;
	@FindBy(id = "firstName")
	private WebElement first;
	@FindBy(xpath = "//*[@id=\"lastName\"]")
	private WebElement last;
	@FindBy(id = "employeeId")
	private WebElement idN;
	@FindBy(xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
	private WebElement location;
	@FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
	private WebElement box;
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement user;
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement pass;
	@FindBy(xpath = "//*[@id=\"confirmPassword\"]")
	private WebElement passC;
	@FindBy(xpath = "//*[@id=\"adminRoleId_inputfileddiv\"]/div/input")
	private WebElement role;
	@FindBy(id = "systemUserSaveBtn")
	private WebElement save;
	//Started to use xpath because it was easier to just copy and paste but would definitely go back to edit and use id.
	public void Employee()
	{
		pim.click();
		
		
	}
	public void addU()
	{
		add.click();
	}
	
	public void info(WebDriver driver, String idd)
	{
		first.sendKeys("Usman");
		last.sendKeys("Qureshi");
		location.click();
		location.sendKeys(Keys.DOWN);
		location.sendKeys(Keys.DOWN);
		location.sendKeys(Keys.DOWN);
		location.sendKeys(Keys.ENTER);
		idN.sendKeys(Keys.BACK_SPACE);
		idN.sendKeys(Keys.BACK_SPACE);
		idN.sendKeys(Keys.BACK_SPACE);
		idN.sendKeys(Keys.BACK_SPACE);
		idN.sendKeys(idd);
		WebElement idW = driver.findElement(By.id("employeeId"));
		a = idW.getAttribute("value");		
		System.out.println(a);
	}
	public void boxC()
	{
		box.click();
	}
	
	public void moreinfo()
	{
		
		user.sendKeys("Usmannn12345678"); //increment by 1 every run
		pass.sendKeys("123*Password123");
		passC.sendKeys("123*Password123");
		role.click();
		role.sendKeys(Keys.DOWN);
		role.sendKeys(Keys.ENTER);
		
	}
	public void saveB()
	{
		save.click();
	}

}
