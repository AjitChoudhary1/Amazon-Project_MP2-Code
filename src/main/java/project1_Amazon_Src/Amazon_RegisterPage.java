package project1_Amazon_Src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_RegisterPage                            // For TC1
{
	WebDriver driver;
	
	
	// step- 1 - Locate each component using @FindBy Annotation
	     
	@FindBy(xpath="//div[@class='nav-div'][2]") 
	   WebElement accountlist;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	   WebElement signinclick;
	
	     @FindBy(name="email")
	       WebElement username;
	     
	     @FindBy(id="continue")
	       WebElement continuebutton;
	     
	     @FindBy(xpath="//input[@class='a-button-input']")
	       WebElement proceedto;
	     
	     @FindBy(name="customerName")
	       WebElement yourname;
	     
	     @FindBy(name="password")
	       WebElement password;
	     
	     @FindBy(id="continue")
	       WebElement vrfymobilenmbr;
	     
	     
// step- 2 - Create separate methods for each component to perform action
	     
	     public void HoverOver(WebDriver driver)
	 	 {
	 		Actions a1= new Actions(driver);
	         a1.moveToElement(accountlist).perform();
	 	 }
	 	
	 	public void Signin()
	 	{
	 		signinclick.click();
	 	}
	     
	     public void Un()
	     {
	    	 username.sendKeys("8290654399");
	     }
	     
	     public void ProceedTo()
	     {
	    	 proceedto.click();
	     }
	     
	     public void PressContinueButton()
	     {
	    	 continuebutton.click();
	    	 
	    	 
	     }
	     
	     public void NamePwdMobile()
	     {
	    	 yourname.sendKeys("Ajit Choudhary");
	    	 password.sendKeys                                                                                                                                                                                         ("Aj@8031");
	    	 vrfymobilenmbr.click();
	     }
	     
	  
	     
	     
	     
	/* If want to register account again then use these findsby and Methods
	     
         @FindBy(id="createAccount")
           WebElement createaccount;
     
         @FindBy(xpath="//i[@class='a-icon a-icon-checkbox']")
           WebElement checkbox;
     
         @FindBy(xpath="//input[@class='a-button-input']")
            WebElement createyracunt;
            
            
            
    /*  public void CreateYourAccount()
        {
         createaccount.click();
    	 checkbox.click();
    	 createyracunt.click();
    	 
        } 
                
     */
	     
	     
	     
	     
	     
	     
 // step- 3 - Initializing the elements using PageFactory class inside the constructor
	     
	     public Amazon_RegisterPage(WebDriver driver)
	     {
	    	 //this.driver=driver;
	    	 PageFactory.initElements(driver, this);
	    	 
	     }
	
	     
	     
	//input[@class='a-button-input']
	   //input[@type='submit']
	   //input[@aria-labelledby='intention-submit-button-announce']

}
