package project1_Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_WrongUn_PwdPage;

public class TC3_Fail_Login extends AmazonPr_BaseClass
{
	@Test (dataProvider="UnPwdExcel")
	public void LoginFail_ToAmazon(String username, String password)
	{
	        // 3 Ensure login fails with incorrect email or password.
	   
	           System.out.println("Title is-> " + driver.getTitle());
	           
	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
	               hp.Signin();
	   
	        Amazon_WrongUn_PwdPage runpwdp= new Amazon_WrongUn_PwdPage(driver);
	                   runpwdp.Un(username);
	                   runpwdp.ContinueButton();
	                   runpwdp.Pwd(password);
	                   runpwdp.SigninPress();
	
	
	}
	
	
	 @DataProvider
     public Object [][] UnPwdExcel() throws EncryptedDocumentException, IOException
     {
    	 Object [][] unpwd= new Object[1] [2];
		 
		   FileInputStream f1= new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\Excel Sheet\\Login Details.xlsx");
		       
		        Workbook w1=  WorkbookFactory.create(f1);			           
		        
		        
		        String un1 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(2).getCell(0).getNumericCellValue());
		        String pwd1 = w1.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
		        
			    unpwd[0][0]=un1;
			    unpwd[0][1]=pwd1;
    	 
		return unpwd;
	
     }
	
	
}
