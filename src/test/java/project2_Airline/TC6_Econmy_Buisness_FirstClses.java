package project2_Airline;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_LoginPage;

public class TC6_Econmy_Buisness_FirstClses extends Airline_BaseClass
{
	@Test (dataProvider="UnPwdExcel")
	public void Search_Ecnmy_Business_FirstClses(String username, String password)
	{
		
	        // 6 Validate search results for different classes (economy, business, first class).

				
	   
		
	           System.out.println("Title is-> " + driver.getTitle());
	           
	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
	               hp.Signin();
	   
	        Amazon_LoginPage lp= new Amazon_LoginPage(driver);
	                lp.Un(username);
	                lp.ContinueButton();
	                lp.Pwd(password);
	                lp.SigninPress();
	        
	            
	              
	        
	
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
