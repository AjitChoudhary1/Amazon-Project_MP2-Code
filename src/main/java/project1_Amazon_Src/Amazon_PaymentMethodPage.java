package project1_Amazon_Src;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_PaymentMethodPage                   //For TC12
{
	   WebDriver driver;
		
		//step-1 Locate component
		
	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;
	   
	   @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
		WebElement clickfirstprod;
		
		
		@FindBy(id="buy-now-button")
		   WebElement buynow;
		
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")         
		  WebElement paymentmethod1;
		
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
		  WebElement paymentmethod2;
		
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
		  WebElement paymentmethod3;
		
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
		  WebElement paymentmethod4;
		
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
		  WebElement paymentmethod5;
		
		
		/*@FindBy(xpath="//a[@class='a-link-normal attach-close-button']")
		   WebElement closemark;
           */
		
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
			paymentmethod1.click();
			driver.navigate().refresh();
			
			paymentmethod2.click();
			driver.navigate().refresh();
			
			paymentmethod3.click();
			driver.navigate().refresh();
			
			paymentmethod5.click();
			//driver.navigate().refresh();
			          
		}
		

		
		//step-3 Initialize element by PageFactory class inside constructor
		
		public Amazon_PaymentMethodPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}

}
