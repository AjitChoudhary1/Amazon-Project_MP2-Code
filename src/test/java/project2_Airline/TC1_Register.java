package project2_Airline;

import org.testng.annotations.Test;

import project2_Airline_Src.Airline_RegisterPage;

public class TC1_Register extends Airline_BaseClass
{
	@Test
	public void Register_ToAirIndia() throws InterruptedException
	{
	    	   
	    	   // 1 Verify that users can successfully register for a new account.
	    	   
	    	   System.out.println("Title is-> " + driver.getTitle());
	    	   
	    	   Airline_RegisterPage regpage= new Airline_RegisterPage(driver);
	    	        //Air India
	    	            /* regpage.Signin();
	    	             regpage.Signup();
	    	             
	    	             regpage.CreateAccount();
	    	             
	    	             regpage.Submit(driver);
	    	              */
	    	   
	    	   
	    	       //Southwest
	    	           /* regpage.SWAccount();
	    	           * regpage.AccountDetails();
	    	            */
	    	   
	    	   
	    	   
	    	      //Ryanair
	    	          regpage.RAAccount(driver);
	    	         
	    	   
	    	   
	       }
		
		
	

}
