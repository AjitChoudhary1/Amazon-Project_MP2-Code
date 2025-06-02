package project1_Amazon_Src;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProfilePage                        //For TC4
{
	WebDriver driver;
	
	//step-1 Locate component
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[8]")
	   WebElement youraccount;
	
	@FindBy(xpath="(//span[@class='a-color-secondary'])[2]")
	   WebElement editprofile;
	
	@FindBy(xpath="(//a[.='Edit'])[1]")
	   WebElement clickedit;
	
	@FindBy(id="ap_customer_name")
	  WebElement controlA;
	
	@FindBy(id="ap_customer_name")
	  WebElement newname;
	
	@FindBy(id="cnep_1C_submit_button")
	  WebElement savechanges;
	
	
	
	//step-2 Separate method for each component
	
	public void YourAccount()
	{
		youraccount.click();
	}
	
	public void EditProfile()
	{
		editprofile.click();
		clickedit.click();
		controlA.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		newname.sendKeys("AjitRupa Choudhary");
		savechanges.click();
	}
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	

}
