package project1_Amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_ProductPage4;

@Listeners(Amazon_ITestListener.class)
public class Z_TC15_WithOut_Login_Cart extends AmazonPr_BaseClass
{
	 @Test (retryAnalyzer=Amazon_RetryAnalyzer.class)
	   public void ReachTillTC15_Cart_WithoutLoginAmazon()
	   {
		 
		  // 15 Reach till cart page without login in amazon application
		   
		 
		   System.out.println("Title is-> " + driver.getTitle());
		   
		          
	       Amazon_ProductPage4 cart= new Amazon_ProductPage4(driver);
	              cart.SearchProduct();
	              cart.FirstProdClick();
	              cart.ControlChild(driver);
	              cart.CartOpen();
		   
		   
		   
	   }
     
	   
}
