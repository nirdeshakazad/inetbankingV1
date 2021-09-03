package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomer_004 extends BaseClass{
	
	@Test
	public void editCustomer() throws InterruptedException, IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		EditCustomerPage editcust = new EditCustomerPage(driver);
		editcust.lnkEditCustomer();	
		editcust.custId("43699");
		editcust.submit();
		//editcust.custTelephone("1111111124");
		String editTelephone= randomNumber2();
		editcust.custTelephone(editTelephone);
		editcust.custsubmit();
		
		boolean res=driver.getPageSource().contains("Customer details updated Successfully!!!");
		if (res==true)
		{
			
			Assert.assertTrue(true);

		}
		else
		{
			captureScreen(driver,"EditCustomer");
			Assert.assertTrue(false);
		}
		
		
	}

}
