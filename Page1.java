package Mavens.Teatest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page1 
{
	@FindBy(id = "txtUsername")
	private WebElement user;
	@FindBy(id = "txtPassword")
	private WebElement pass;
	@FindBy(id = "btnLogin")
	private WebElement login;
	@FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
	private WebElement pim;
	@FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
	private WebElement add;
	//Started to use xpath because it was easier to just copy and paste but would definitely go back to edit and use id.
	public void logging(String userL, String passL)
	{
		user.sendKeys(userL);
		pass.sendKeys(passL);
		login.click();
		
		//menuH.getText();
	}
	public void Employee()
	{
		pim.click();
		add.click();
	}

	
	
	
	
	
	
	
}
