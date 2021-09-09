package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.WithdrawAmount;

public class TC_WithdrwalAmount_008 extends BaseClass {
	
	
	@Test
	public void amountWithdraw() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(2000);
		
		WithdrawAmount amtWithDraw= new WithdrawAmount(driver);
		amtWithDraw.withdrawlLink();
		amtWithDraw.enterAccNumber();
		amtWithDraw.enterAmnt();
		amtWithDraw.enterDescription();
		amtWithDraw.clickSubmit();
		Thread.sleep(3000);
	}

}
