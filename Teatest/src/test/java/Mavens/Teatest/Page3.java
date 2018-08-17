package Mavens.Teatest;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page3 
{
	@FindBy(xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]")
	private WebElement findE;
	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement pim;
	@FindBy(xpath = "//*[@id=\"employee_name_quick_filter_employee_list_value\"]") 
	private WebElement searchE;
	@FindBy(xpath = "//*[@id=\"employeeListTable\"]/tbody/tr/td[1]/img")
	private WebElement profile;
	//Started to use xpath because it was easier to just copy and paste but would definitely go back to edit and use id.
	
	public void find(String idd)
	{
		findE.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchE.sendKeys(idd);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		searchE.sendKeys(Keys.ENTER);
		profile.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
