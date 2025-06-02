package project1_Amazon_Src;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchPage                                 //For TC6 and TC8
{
	   WebDriver driver;
		
		//step-1 Locate component
		
	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;
	   
	   @FindBy(xpath = "//a[@aria-label=\"Apply the filter Puma to narrow results\"]")
		WebElement pumacheckbox;

		@FindBy(xpath = "((((//div[@id='priceRefinements']/ul)[1]/span/span)/li/span)/a)[2]")
		WebElement pricefilter;

		@FindBy(xpath = "//button[@value=\"8\"]")
		WebElement sizefilter;

		@FindBy(xpath = "(//div[@class='a-section'])[3]/a")
		WebElement rating4nup;
		
		@FindBy(xpath = "//input[@id=\"p_36/range-slider_slider-item_lower-bound-slider\"]")
		WebElement lowrange;
		

		@FindBy(xpath = "//input[@id=\"p_36/range-slider_slider-item_upper-bound-slider\"]")
		WebElement upperange;
		
		//step-2 Separate method for each component
		
		public void SearchProduct()
		{
			searchproduct.sendKeys("Shoe" + Keys.ENTER);
		}
		public void CheckBoxClick() 
		{
			pumacheckbox.click();
		}

		public void PriceClick() throws InterruptedException 
		{
			Thread.sleep(2000);
			pricefilter.click();

		}

		public void SizeClick()
		{
			sizefilter.click();
		}

		public void RatingClick() throws InterruptedException 
		{
			Thread.sleep(1000);
			rating4nup.click();
		}

		public String Validation_Success() 
		{
			String s3 = lowrange.getDomAttribute("aria-valuetext")+" - "+upperange.getDomAttribute("aria-valuetext");

			//String s3 = pricefilter.getText();
			System.out.println("price --->" + s3);
			return s3;
		}
		
		//step-3 Initialize element by PageFactory class inside constructor
		
		public Amazon_SearchPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}

}
