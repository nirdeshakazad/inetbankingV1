package com.inetbanking.testCases;

import org.testng.annotations.Test;

//import org.openqa.selenium.NoAlertPresentException;

import com.inetbanking.pageObjects.AddNewAccount;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddNewAccount_005 extends BaseClass {

	
	@Test
	public void NewAccount() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(2000);

		AddNewAccount addAcc=new AddNewAccount(driver);
		
		addAcc.clickAddNewAccount();
		addAcc.customerId();
		addAcc.accountType();
		addAcc.initialDeposit();
		addAcc.submit();
		Thread.sleep(3000);
		
		
		
		
	}

}
