package com.inetbanking.testCases;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{


	@Test
	public void loginTest() throws IOException 
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp= new LoginPage(driver); // Creating object for LoginPage from page Objects package

		lp.setUserName(username);
		logger.info("Entered user name");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		logger.info("Clicked Submit button");


		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);

		}
		else {

			Assert.assertFalse(false);
			captureScreen(driver, "loginTest");
		}

	}

}
