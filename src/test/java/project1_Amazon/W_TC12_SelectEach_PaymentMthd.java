package project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_LoginPage;
import project1_Amazon_Src.Amazon_PaymentMethodPage;
import project1_Amazon_Src.Excel_DataFetching;

@Listeners(Amazon_ITestListener.class)
public class W_TC12_SelectEach_PaymentMthd extends AmazonPr_BaseClass 
{
	 @Test (retryAnalyzer=Amazon_RetryAnalyzer.class)
	   public void SelectTC12_AllPaymentAmazon() throws EncryptedDocumentException, IOException
	   {
		 
		  // 12 Check if user is able to select each payment method
		   
		 
		   System.out.println("Title is-> " + driver.getTitle());
		   
		   Excel_DataFetching d1=new Excel_DataFetching();
	          d1.LoginData();
         
	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
	               hp.Signin();
	   
	        Amazon_LoginPage lp= new Amazon_LoginPage(driver);
	                lp.Un();
	                lp.ContinueButton();
	                lp.Pwd();
	                lp.SigninPress();
		   
		          
	        Amazon_PaymentMethodPage payp= new Amazon_PaymentMethodPage(driver);
		                payp.SearchProduct();
		                payp.FirstProdClick();
		                payp.ControlChild(driver);
		                payp.AllPaymentMethods(driver);
		   
		   
	   }
     
	   
	   
}	 
	 
	 
	 
















































	 
	/* 
	   
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
	
*/