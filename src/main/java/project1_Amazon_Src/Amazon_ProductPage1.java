package project1_Amazon_Src;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage1               // For TC7, and TC9 
{
	   WebDriver driver;
		
		//step-1 Locate component
		
	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;
	   
	   @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
		WebElement clickfirstprod;

		@FindBy(xpath = "//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")
		WebElement pricedisplay;

		@FindBy(xpath = "//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-none detail-bullet-list']")           
		WebElement productdetailsdisplay;
		
		
		
		@FindBy(name="submit.add-to-cart")
		   WebElement addtocart;
		
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
			       
			       addtocart.click();
			      // closemark.click();
		}

		public void DetailsDisplays(WebDriver driver)
		{
			pricedisplay.isDisplayed();
			  System.out.println("Child W Title-> " + driver.getTitle());
			  System.out.println("The Url is-> " + driver.getCurrentUrl());
			productdetailsdisplay.isDisplayed();
			 // System.out.println("Child WPage Source-> " + driver.getPageSource());
			    
		}

		
		//step-3 Initialize element by PageFactory class inside constructor
		
		public Amazon_ProductPage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}

}
