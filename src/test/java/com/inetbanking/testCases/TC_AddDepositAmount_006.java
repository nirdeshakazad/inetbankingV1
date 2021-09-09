package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddDepositAmounts;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddDepositAmount_006 extends BaseClass{
	
	
	
@Test	
public void DepositAmount() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(2000);
		
		AddDepositAmounts addDepAmt=new AddDepositAmounts(driver);
		addDepAmt.clickDeposit();
		addDepAmt.accountnum();
		addDepAmt.enterAmount();
		addDepAmt.description();
		addDepAmt.submit();
		Thread.sleep(3000);
		
}


}
