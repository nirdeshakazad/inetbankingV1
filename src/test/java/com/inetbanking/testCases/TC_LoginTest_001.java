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
		LoginPage lp= new LoginPage(driver); // Creating object for LoginPage from page Objects package

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();


		if (driver.getTitle().equals(" GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);

		}
		else {

			Assert.assertFalse(false);
			captureScreen(driver, "loginTest");
		}

	}

}
