package project1_Amazon_Src;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage3                  // For TC10
{
	   WebDriver driver;
		
		//step-1 Locate component
		
	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;
	   
	   @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
		WebElement clickfirstprod;
		
		
		@FindBy(name="submit.add-to-cart")
		   WebElement addtocart;
		
		@FindBy(xpath="//span[@id=\"sw-gtc\"]")           
		  WebElement gotocart;
		
		@FindBy(xpath="//input[@value='Delete']")
		  WebElement delete;
		
		
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
			       
			       
			       
			       System.out.println("Child W Title-> " + driver.getTitle());
			       System.out.println("The Url is-> " + driver.getCurrentUrl());
		}
		
		public void AddToCart()
		{
			addtocart.click();
		}
		
		
		public void CartOpen()
		{
			gotocart.click();
			delete.click();
		}

		
		//step-3 Initialize element by PageFactory class inside constructor
		
		public Amazon_ProductPage3(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}

}
