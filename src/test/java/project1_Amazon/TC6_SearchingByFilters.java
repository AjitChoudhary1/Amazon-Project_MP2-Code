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
import org.testng.asserts.SoftAssert;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_LoginPage;
import project1_Amazon_Src.Amazon_SearchPage;

public class TC6_SearchingByFilters extends AmazonPr_BaseClass implements ITestListener
{
	 @Test (dataProvider="UnPwdExcel")
	   public void SearchProduct_FilterAmazon(String username, String password) throws InterruptedException
	   {
		 
		 // 6 Verify that searching with filters (e.g., category, price range) fields accurate results.
		 
		   SoftAssert s1= new SoftAssert();
		   
		   System.out.println("Title is-> " + driver.getTitle());
         
	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
	               hp.Signin();
	               
	   
	        Amazon_LoginPage lp= new Amazon_LoginPage(driver);
	                lp.Un(username);
	                lp.ContinueButton();
	                lp.Pwd(password);
	                lp.SigninPress();
		   
		          
	       Amazon_SearchPage sp= new Amazon_SearchPage(driver);
	                sp.SearchProduct();
	                sp.CheckBoxClick();
	                sp.PriceClick();
	                sp.SizeClick();
	                sp.RatingClick();
	               // sp.Validation_Success();
	                
	                
	                
	                
	                String title=driver.getTitle();
	        		
	        		System.out.println(title);
	        		//System.out.println(fp.validation_success());
	        	
	        		
	        		
	        		             //Assertion 1
	        		
	        		s1.assertEquals(driver.getTitle(),"Amazon.in: Shoe - 256097 / "+ sp.Validation_Success()
	        		 +" / 8: Shoes & Handbags");   
	        		
	        		//Amazon.in: Shoe - 256097 / ₹2,000 - ₹2,900 / 4 Stars & Up / 8: Shoes & Handbags

		   
		   
		           s1.assertAll("Assertion Is Got Failed");
	   }
     
	   
	   
	   
	   @DataProvider
	     public Object [][] UnPwdExcel() throws EncryptedDocumentException, IOException
	     {
	    	 Object [][] unpwd= new Object[1] [2];
			 
			   FileInputStream f1= new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\Excel Sheet\\Login Details.xlsx");
			       
			        Workbook w1=  WorkbookFactory.create(f1);			           
			        
			        
			        String un1 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(0).getCell(0).getNumericCellValue());
			        String pwd1 = w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
			        
				    unpwd[0][0]=un1;
				    unpwd[0][1]=pwd1;
	    	 
			return unpwd;
		
	     }
	
	
	
	
	
}
