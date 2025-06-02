package project1_Amazon_Src;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage2             // For TC8
{
	   WebDriver driver;
		
		//step-1 Locate component
		
	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;
	   
	  // @FindBy(xpath="//span[@id='a-autoid-0-announce']")
	     @FindBy(xpath="//span[@class='a-dropdown-container']")
		WebElement sortby_featured;

	   @FindBy(xpath="(//li[@class='a-dropdown-item'])[2]")
		WebElement lowtohigh;

		
		//step-2 Separate method for each component
		
		public void SearchProduct()
		{
			searchproduct.sendKeys("Shoe" + Keys.ENTER);
		}
		public void SortByFeatured()
		{
			sortby_featured.click();
		}
		public void sortbyLowToHigh()
		{
			lowtohigh.click();
		}

		
		//step-3 Initialize element by PageFactory class inside constructor
		
		public Amazon_ProductPage2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}

		

}






	// ----Asseration-----//

	/*public boolean validation_success()
	 *  {
		
		boolean status=false;
		String s3 = lowpriceshoe.getText();
		System.out.println("low price after applying sortby: low to high price --->" +s3);

		int num1 = Integer.parseInt(s3);
		
		String s4 = lowrange.getDomAttribute("aria-valuetext");
		System.out.println("lower price at slider"+s4);
		
		int num2 = Integer.parseInt(s4);
		
		if(num1>=num2) 
		{
			status=true;
		}
		return status;

		
	}*/

