package project1_Amazon_Src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_RatingPage                        //For TC14
{
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[9]")
	   WebElement yourorder;
	
	@FindBy(xpath="//option[@value='year-2024']")
	   WebElement slctyear;
	
	@FindBy(xpath="//a[@id='a-autoid-5-announce']")
	  WebElement reviewclick;
	
	@FindBy(xpath="(//span[@class='in-context-ryp__form-field--starRating-single'])[5]")
	  WebElement star5;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	  WebElement submit;
	
	
	//step-2 Separate method for each component
	
	public void Rating()
	{
		yourorder.click();
		slctyear.click();
		reviewclick.click();
		star5.click();
		//submit.click();
	}
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_RatingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	

}
