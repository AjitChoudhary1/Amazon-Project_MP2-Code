package project1_Amazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class AmazonPr_BaseClass  implements ITestListener
{
	WebDriver driver;
	
	 @BeforeMethod
	 @Parameters("Browsers")
	 public void Launching(@Optional("edge")String NameOfBrowser)
	 {
	    	
	       
		 if(NameOfBrowser.equals("edge"))
		 {
		   driver= new EdgeDriver();
		 }
		 
		 if(NameOfBrowser.equals("chrome"))
		 {
			 driver= new ChromeDriver();
			 //driver.navigate().refresh();
		 }
		 
		 driver.get("https://www.amazon.in");
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		 
		      System.out.println();Reporter.log("Browser Is Launched Sucessfully");
	 }    
	 
	  
	 @AfterMethod
	 public void Closing()
	 {
		
		 // driver.close();
		    System.out.println(); Reporter.log("Browser Is Closed Sucessfully");
	 }
	 
		      
		      @Override
		  	public void onTestSuccess(ITestResult ontestsuccess) 
		  	{
		  		// TODO Auto-generated method stub
		  		   
		  		
		  		ITestListener.super.onTestFailure(ontestsuccess);
		  	    Reporter.log("Test Case Is Fail");
		  	    
		  	          TakesScreenshot t1= (TakesScreenshot) driver;
		  		  File source= t1.getScreenshotAs(OutputType.FILE);
		  		  File destination= new File("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\ScreenShots\\Fail Sshot\\TCFail " + getClass() + ".jpg");
		  		  try 
		  		  {
		  			FileHandler.copy(source, destination);
		  			      System.out.println("Screenshot is Saved");
		  		  } 
		  		  catch (IOException e)
		  		  {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		  }
		  		
		  	}
		       
		  	 @Override
		  	public void onTestFailure(ITestResult ontestfailure) 
		  	{
		  		// TODO Auto-generated method stub
		  	     
		  		// TODO Auto-generated method stub
		  		ITestListener.super.onTestFailure(ontestfailure);
		  		    Reporter.log("Test Case Is Fail");
		  		    
		  		          TakesScreenshot t1= (TakesScreenshot) driver;
		  			  File source= t1.getScreenshotAs(OutputType.FILE);
		  			  File destination= new File("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\ScreenShots\\Fail Sshot\\TCFail " + new TC2_Login().getClass() + ".jpg");
		  			  try 
		  			  {
		  				FileHandler.copy(source, destination);
		  				      System.out.println("Screenshot is Saved");
		  			  } 
		  			  catch (IOException e)
		  			  {
		  				// TODO Auto-generated catch block
		  				e.printStackTrace();
		  			  }
		  			  
		  	}
		  		
		  	
		      
	

}






/*<dependencyManagement>
<dependencies>
	<dependency>
		<groupId>org.junit</groupId>
		<artifactId>junit-bom</artifactId>                                // 1st Part above dependencies
		<version>5.11.0</version>
		<type>pom</type>
		<scope>import</scope>
	</dependency>
</dependencies>
	
	
	</dependencyManagement>*/







/*<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-api</artifactId>                             // 2nd Part below dependencies
<scope>test</scope>
</dependency>
<!-- Optionally: parameterized tests support -->
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-params</artifactId>
<scope>test</scope>
</dependency>*/