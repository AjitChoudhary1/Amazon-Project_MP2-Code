package project1_Amazon_Src;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_CardPayPage                   //For TC16
{
	   WebDriver driver;
		
		//step-1 Locate component
		
	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;
	   
	   @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
		WebElement clickfirstprod;
		
		
		@FindBy(id="buy-now-button")
		   WebElement buynow;
		
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")         
		  WebElement cardpayment;
		
		@FindBy(xpath="//a[.='Add a new credit or debit card']")         
		  WebElement addnewcard;
		
		@FindBy(xpath="//input[@class='a-input-text a-form-normal pmts-account-Number']")
		  WebElement cardnumber;
		
		@FindBy(xpath="(//a[@class='a-dropdown-link'])[7]")
		  WebElement expirydate;
		
		
		//step-2 Separate method for each component
		
		public void SearchProduct()
		{
			searchproduct.sendKeys("Abstract Shirt" + Keys.ENTER);
		}
		public void FirstProdClick() 
		{
			clickfirstprod.click();
		}
		
		public void ControlChild(WebDriver driver)
		{
			Set<String> pcid= driver.getWindowHandles();
			  Iterator<String> ids= pcid.iterator();
			     
			 
				String parentid= ids.next();
			    String childid= ids.next();
			    
			       driver.switchTo().window(parentid);
			       driver.switchTo().window(childid);
			       
			       buynow.click();
			       
			       System.out.println("Child W Title-> " + driver.getTitle());
			       System.out.println("The Url is-> " + driver.getCurrentUrl());
		}
		
		public void AllPaymentMethods(WebDriver driver)
		{
			cardpayment.click();
			addnewcard.click();
			cardnumber.sendKeys("8526896341257896");
			expirydate.click();
		}
		

		
		//step-3 Initialize element by PageFactory class inside constructor
		
		public Amazon_CardPayPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}

}
