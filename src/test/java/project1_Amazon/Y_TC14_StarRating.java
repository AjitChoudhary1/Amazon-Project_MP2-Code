package project1_Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.ITestListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_LoginPage;
import project1_Amazon_Src.Amazon_LogoutPage;
import project1_Amazon_Src.Amazon_RatingPage;

public class Y_TC14_StarRating extends AmazonPr_BaseClass implements ITestListener
{
	 @Test (dataProvider="UnPwdExcel")
	   public void Star5_Rating_LastOrder_Amazon(String username, String password) throws InterruptedException
	   {
		 
		  // 14 Go to orders page and click on your last ordered product and give 5 star ratings

		 
		   System.out.println("Title is-> " + driver.getTitle());
         
	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
	               hp.Signin();
	   
	        Amazon_LoginPage lp= new Amazon_LoginPage(driver);
	                lp.Un(username);
	                lp.ContinueButton();
	                lp.Pwd(password);
	                lp.SigninPress();
		   
	                hp.HoverOver(driver);
	                
	       Amazon_RatingPage rate= new Amazon_RatingPage(driver);
	                rate.Rating();
	                
	      Amazon_LogoutPage logout= new Amazon_LogoutPage(driver);
	                   Thread.sleep(5000);
	                logout.HoverOverHelloAjit(driver);
	                logout.SignOutPressChildW();
		   
		   
		   
		   
	   }
     
	   
	   
	   
	   @DataProvider
	     public Object [][] UnPwdExcel() throws EncryptedDocumentException, IOException
	     {
	    	 Object [][] unpwd= new Object[1] [2];
			 
			   FileInputStream f1= new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\Excel Sheet\\Login Details.xlsx");
			       
			        Workbook w1=  WorkbookFactory.create(f1);			           
			        
			        
			        String un1 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(4).getCell(0).getNumericCellValue());
			        String pwd1 = w1.getSheet("Login").getRow(4).getCell(1).getStringCellValue();
			        
				    unpwd[0][0]=un1;
				    unpwd[0][1]=pwd1;
	    	 
			return unpwd;
		
	     }
	
	
	
	
	
}
