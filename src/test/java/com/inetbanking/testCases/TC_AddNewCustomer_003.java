package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_003 extends BaseClass {
	
	public boolean isAlertPresent() // user defined method created to check alert is present or not
	{
		try {
			driver.switchTo().alert();
			return true;
		}
		catch (NoAlertPresentException e) {
			return false;
		}

	}


	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.custName("Nirdeshak");
		addcust.custGender("male");
		addcust.custdob("07","20", "1988");
		Thread.sleep(3000);
		addcust.custAddress("Flatno102 Aditya Towers SubashNagar Jeedimetla Hyderabad");
		addcust.custCity("Hyderabad");
		addcust.custState("Telangana");
		addcust.custPincode("500055");
		addcust.custTelephone("9247349802");

		// Generate email address and password dynamically from user defined method

		String email= randomstring()+"@gmail.com";
		addcust.custEmail(email);


		addcust.custPassword("P@ssw0rd");
		/*String password=randomNumber();
		addcust.custPassword(password);*/
		
		
		addcust.custsubmit();
		Thread.sleep(3000);
		
		
		


		// Validating new customer added successfully

		//boolean res = driver.getPageti().contains("Customer Registered Successfully!!!");
		//boolean res = driver.getTitle().contains("Customer Registered Successfully!!!");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (res==true)
		{
			Assert.assertTrue(true);

		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}

		

	}

	
}
