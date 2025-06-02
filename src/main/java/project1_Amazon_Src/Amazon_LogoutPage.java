package project1_Amazon_Src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LogoutPage                    // All the TCs
{
         WebDriver driver;
	
	//step-1 Locate component
	
	@FindBy(xpath="//div[@class='nav-div'][2]")
	WebElement helloajit;
	
	@FindBy(linkText="Sign Out")
	WebElement signoutclick;
	
	
	//step-2 Separate method for each component
	
	public void HoverOverHelloAjit(WebDriver driver)
	{
		Actions a1= new Actions(driver);
        a1.moveToElement(helloajit).perform();
	}
	
	public void SignOutPressChildW()
	{
		signoutclick.click();
	}
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
