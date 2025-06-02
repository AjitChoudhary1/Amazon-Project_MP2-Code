package project2_Airline_Src;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class Airline_RegisterPage 
{
        WebDriver driver;
	
	
	// step- 1 - Locate each component using @FindBy Annotation
        
	   @FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	     WebElement acceptbutton;
	   
	@FindBy(xpath="//button[@id='signIn']")
	   WebElement signinclick;
	
	@FindBy(xpath="//button[@id='create-account-button']")
	   WebElement signup;
	
	     @FindBy(xpath="//div[@class='mat-select-arrow ng-tns-c44-1']")
	       WebElement titleclick;
	     
	     @FindBy(xpath="(//span[@class='mat-option-text'])[1]")
	       WebElement mrclick;
	     
	     @FindBy(xpath="//input[@name='userfirstNameInput']")
	       WebElement firstname;
	     
	     @FindBy(xpath="//input[@name='userLastName']")
	       WebElement lastname;
	     
	     @FindBy(xpath="//input[@id='date_of_birth']")
	       WebElement dateofbirth;
	     
	     @FindBy(xpath="//option[@aria-label='January']")
	       WebElement month;
	     
	     @FindBy(xpath="//option[@value='1998']")
	       WebElement year;
	     
	     @FindBy(xpath="(//div[@class='ngb-dp-day ng-star-inserted'])[23]")
	       WebElement date;
	     
	     @FindBy(xpath="//input[@name='contactEmail']")
	       WebElement email;
	     
	     @FindBy(xpath="//input[@name='confirmEmail']")
	       WebElement confirmemail;
	     
	     @FindBy(xpath="//input[@id='phoneNo']")
	       WebElement phoneno;
	     
	     @FindBy(xpath="//input[@id='confirmPhoneNo']")
	       WebElement confirmphoneno;
	     
	     //@FindBy(xpath="//input[@id='promotionCheck']")
	      // WebElement checkbox;
	     
	     @FindBy(xpath="//button[@id='submit-button']") //button[@type='submit']
	       WebElement submitbutton;
	     
	     
// step- 2 - Create separate methods for each component to perform action
	     
	     public void Signin()
	 	 {
	    	 acceptbutton.click();
	    	 signinclick.click();
	 	 }
	 	
	 	public void Signup()
	 	{
	 		signup.click();
	 	}
	     
	     public void CreateAccount()
	     {
	    	 titleclick.click();
	    	 mrclick.click();
	    	 
	    	 firstname.sendKeys("Ajit");
	    	 lastname.sendKeys("Choudhary");
	    	 
	    	 dateofbirth.click();
	    	 month.click();
	    	 year.click();
	    	 date.click();
	    	 
	    	 email.sendKeys                                                                                                                                                                                                                                              ("ajitchoudhary0902@gmail.com");       
	    	 confirmemail.sendKeys                                                                                                                                                                                                                                       ("ajitchoudhary0902@gmail.com");
	     
	    	 phoneno.sendKeys                                                                                                                                                                                                                                                    ("8233668067");
	    	 confirmphoneno.sendKeys                                                                                                                                                                                                                                             ("8233668067");
	    	 
	    	 //checkbox.click();
	     }
	             
	     public void Submit(WebDriver driver) throws InterruptedException
	     {
	          WebElement submit= driver.findElement(By.xpath("//button[@id='submit-button']"));
	          
		        JavascriptExecutor js=  (JavascriptExecutor)      driver;
		          js.executeScript("arguments[0].removeAttribute('disabled')", submit);
		               
		          System.out.println("The Button Is Enable-> " + submit.isEnabled());
		          System.out.println("The Button Is Displayed-> " + submit.isDisplayed());
		         // System.out.println("The Button outerHTML before click-> " + submit.getDomAttribute("outerHTML"));
		       
				  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit-button']")));

                      // System.out.println("Attempting js click...");
                                
                                  //submit.click();
                       
	    	          js.executeScript("arguments[0].click()", submit);
	    	         // Thread.sleep(5000);
	    	         // System.out.println("js click executed.");
	    	          
	    	         // Thread.sleep(5000);
	     }
	     
	     
	     
	     
 // step- 3 - Initializing the elements using PageFactory class inside the constructor
	     
	     public Airline_RegisterPage(WebDriver driver)
	     {
	    	 this.driver=driver;
	    	 PageFactory.initElements(driver, this);
	    	 
	     }
	     
	     
	     
	     
	     
	     
	    
 //*****************************************************************************************************************	     
	      //SouthWest Airline
	     
	  // step- 1 - Locate each component using @FindBy Annotation
	        
		   @FindBy(xpath="//a[.='Create account']")
		     WebElement createaccount;
		   
		@FindBy(name="firstName")
		   WebElement frstname;
		
		@FindBy(name="lastName")
		   WebElement lstname;
		
		@FindBy(id="gender")           //(//input[@class='error__W7BFf iconAllowance__24ymo inputElement__CzSab'])[1]
		   WebElement gender;
		
		@FindBy(id="gender-item-1")
		  WebElement male;
		
		@FindBy(name="dateOfBirth")
		   WebElement dob;
		
		@FindBy(id="countryCode")
		   WebElement country;
		
		@FindBy(name="street")
		   WebElement streetadd;
		
		@FindBy(name="aptSuite")
		   WebElement aptmnt;
		
		@FindBy(name="city")
		   WebElement city;
		
		@FindBy(id="stateProvinceRegion")
		   WebElement state;
		
		@FindBy(name="postalCode")
		   WebElement zipcode;
		
		@FindBy(name="phoneCountryCode")
		  WebElement code;
		
		@FindBy(xpath="(//ul[@id='phoneCountryCode-list'])//li[98]")
		   WebElement indiacode;
		
		@FindBy(name="phoneNumber")
		   WebElement mobileno;
		
		@FindBy(name="email")
		   WebElement mail;
		
		@FindBy(name="confirmEmail")
		   WebElement cnfrmmail;
		
		@FindBy(name="username")
		   WebElement un;
		
		@FindBy(name="password")
		   WebElement pwd;
		
		@FindBy(xpath="(//div[@class='icon__o0Kad iconContainer__yU2Yi'])[1]")
		   WebElement uncheck;
		
		@FindBy(xpath="(//div[.='Create account'])[3]")
		   WebElement creataccountbtn;
		
		
		
		
  // step- 2 - Create separate methods for each component to perform action
	     
	     public void SWAccount()
	 	 {
	    	 
	    	 createaccount.click();
	 	 }
	 	
	 	public void AccountDetails()
	 	{
	 		frstname.sendKeys("Ajit");
	 		lstname.sendKeys("Choudhary");
	 		gender.click();
	 		male.click();
	 		dob.sendKeys("01/20/1998");
	 		country.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
	 		country.sendKeys("India");
	 		streetadd.sendKeys("Tatarwi");
	 		aptmnt.sendKeys("Tatarwi");
	 		city.sendKeys("Badi Khatu");
	 		state.sendKeys("Rajasthan");
	 		zipcode.sendKeys("341301");
	 		
	 		
	 		code.click();
	 		indiacode.click();
	 		
	 		/*WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	 		code.click();
	 		
	 		By india= By.xpath("(//ul[@id='phoneCountryCode-list'])//li[98]");
	 		WebElement indiacode= wait.until(ExpectedConditions.elementToBeClickable(india));
	 		//indiacode.click();
	 		
	 		Actions actions = new Actions(driver);
	 		actions.moveToElement(indiacode).click().perform();
	 		*/
	 		
	 		mobileno.sendKeys                                                                                                                                                                                                                                                      ("8233668067");
	 		mail.sendKeys                                                                                                                                                                                                                                                      ("ajitchoudhary0902@gmail.com");
	 		cnfrmmail.sendKeys                                                                                                                                                                                                                                                 ("ajitchoudhary0902@gmail.com");
	 		un.sendKeys                                                                                                                                                                                                                                                            ("ajitchoudhary");
	 		pwd.sendKeys                                                                                                                                                                                                                                                              ("Aj@803131");
	 		uncheck.click();
	 		//creataccountbtn.click();
	 	}
	
	
	 	
	 	
	 
	 	
  //************************************************************************************************************
	 	
	 	//RyanAir
	 	
	 // step- 1 - Locate each component using @FindBy Annotation
        
	 	@FindBy(xpath="(//button[@class='cookie-popup-with-overlay__button-settings'])[3]")
	 	  WebElement yesagree;
	 	
		   @FindBy(xpath="//button[@class='body-l-lg ry-button--anchor-white ry-button--anchor']")
		     WebElement login;
		   
		@FindBy(xpath="//button[.=' Sign up ']")
		   WebElement signupra;
		
		@FindBy(name="email")
		   WebElement emailra;
		
		@FindBy(name="password")
		   WebElement pwdra;
	 	
	 	
		
	// step- 2 - Create separate methods for each component to perform action
	     
	     public void RAAccount(WebDriver driver)
	 	 {
	    	 yesagree.click();
	    	 login.click();
	    	 
	    	 
	    	/* Set<String> pcid= driver.getWindowHandles();
			  Iterator<String> ids= pcid.iterator();
			     
			 
				String parentid= ids.next();
			    String childid= ids.next();
			    
			       driver.switchTo().window(parentid);
			       driver.switchTo().window(childid);
			       
			       
			       
			       System.out.println("Child W Title-> " + driver.getTitle());
			       System.out.println("The Url is-> " + driver.getCurrentUrl());*/
	    	 
	    	 
	    	 signupra.click();
	    	 emailra.sendKeys                                                                                                                                                                                                                                                      ("ajitchoudhary0902@gmail.com");
	    	 pwdra.sendKeys                                                                                                                                                                                                                                                            ("Aj@803131");
	 	 }
	 	

}
