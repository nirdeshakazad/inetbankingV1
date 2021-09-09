package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.GenerateMiniStatement;
import com.inetbanking.pageObjects.LoginPage;

public class TC_MiniStatement_007 extends BaseClass {

	@Test
	
	public void minStatement() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(2000);
		
		GenerateMiniStatement ministate=new GenerateMiniStatement(driver);
		
		ministate.GenerateMinStatement();
		ministate.enterAccountnum();
		ministate.clickSubmit();
		Thread.sleep(5000);
		
	}
	
}
