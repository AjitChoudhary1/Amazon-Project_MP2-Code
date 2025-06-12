package project2_Airline;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Airline_ITestListener implements ITestListener {

	public static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult ontestsuccess) {  
		
		Date d1= new Date();
		   System.out.println("Epoch Time-> " +d1.getTime());                                                          //                                                                                                                                                                                                    use epoch cnvrtr to convrt time
		   
		     Date d2= new Date(d1.getTime());
		        System.out.println(d2);
		
		  String f1=   d2.toString();
		
		    // Format -->     dd-MM-yyyy_HH-mm-ss    
		
		  String date= f1.substring(8, 10);
		     String month= f1.substring(4, 7);
		       String year=  f1.substring(f1.length()-4);
		       
		       String hour=  f1.substring(11, 13);
		       String min=  f1.substring(14, 16);
		          String sec=  f1.substring(17, 19);
		          
		          String f3=  date+"-".concat(month)+"-".concat(year)+"_".concat(hour)+"-".concat(min)+"-".concat(sec);
		                 System.out.println(f3);

		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\ScreenShots AirlinePrj\\Airline Pass Sshot"
				                                                     + "\\TCPass " +ontestsuccess.getName()+"_" +f3+".png");

		try {
			FileHandler.copy(source, destination);
			System.out.println("Screenshot is Saved-> " + "On Pass");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(ontestsuccess);
		Reporter.log("Test Case Is Pass");

	}

	@Override
	public void onTestFailure(ITestResult ontestfailure) {
		
		Date d1= new Date();
		   System.out.println("Epoch Time-> " +d1.getTime());                                                          //                                                                                                                                                                                                    use epoch cnvrtr to convrt time
		   
		     Date d2= new Date(d1.getTime());
		        System.out.println(d2);
		
		  String f1=   d2.toString();
		
		    // Format -->     dd-MM-yyyy_HH-mm-ss    
		
		  String date= f1.substring(8, 10);
		     String month= f1.substring(4, 7);
		       String year=  f1.substring(f1.length()-4);
		       
		       String hour=  f1.substring(11, 13);
		       String min=  f1.substring(14, 16);
		          String sec=  f1.substring(17, 19);
		          
		          String f3=  date+"-".concat(month)+"-".concat(year)+"_".concat(hour)+"-".concat(min)+"-".concat(sec);
		                 System.out.println(f3);

		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\ScreenShots AirlinePrj\\Airline Fail Sshot"
			                                                         + "\\TCFail " +ontestfailure.getName()+"_" +f3+".png");

		try {
			FileHandler.copy(source, destination);
			System.out.println("Screenshot is Saved-> " + "On Fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(ontestfailure);
		Reporter.log("Test Case Is Fail");

	}

}
