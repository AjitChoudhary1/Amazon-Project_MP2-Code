package project1_Amazon_Src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LoginPage                       // TC2 n All the others
{
	WebDriver driver;
	
	// step- 1 - Locate each component using @FindBy Annotation
	
	        @FindBy(name="email")
               WebElement username;
   
            @FindBy(id="continue")
              WebElement continuebutton;
   
            @FindBy(id="ap_password")
                WebElement password;
   
            @FindBy(id="signInSubmit")
               WebElement signinbutton;
	     
	    
	     
  // step- 2 - Create separate methods for each component to perform action
	     
	     public void Un(String username1)
	     {
	    	 username.sendKeys(username1);                    //                                                                                                                                                                                "8290654399"                 
	     }
	     
	     public void ContinueButton()
	     {
	    	 continuebutton.click();
	     }
	     
	     public void Pwd(String password1)
	     {
	    	 password.sendKeys(password1);                   //                                                                                                                                                                              ("Aj@8031");
	     }
	     
	     
	     public void SigninPress()
	     {
	    	 signinbutton.click();
	     }
	     
  // step- 3 - Initializing the elements using PageFactory class inside the constructor
	     
	     public Amazon_LoginPage(WebDriver driver)
	     {
	    	 //this.driver=driver;
	    	 PageFactory.initElements(driver, this);
	    	 
	     }
	

}
