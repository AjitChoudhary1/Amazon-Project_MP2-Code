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
import project1_Amazon_Src.Amazon_ProductPage1;

public class TC9_AddToCart extends AmazonPr_BaseClass implements ITestListener
{
	 @Test (dataProvider="UnPwdExcel")
	   public void Product_AddToCartAmazon(String username, String password)
	   {
		 
		    // 9 Verify that items can be added to the shopping cart from product pages.
		   
		   System.out.println("Title is-> " + driver.getTitle());
         
	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
	               hp.Signin();
	   
	        Amazon_LoginPage lp= new Amazon_LoginPage(driver);
	                lp.Un(username);
	                lp.ContinueButton();
	                lp.Pwd(password);
	                lp.SigninPress();
		   
	       Amazon_ProductPage1 pp= new Amazon_ProductPage1(driver);
	                  pp.SearchProduct();
	                  pp.FirstProdClick();
	                  pp.ControlChild(driver);
		   
		   
		   
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
