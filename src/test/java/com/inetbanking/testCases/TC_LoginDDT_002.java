package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilites.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException{

		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		
		// calling alert method
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept(); // Close alert
			driver.switchTo().defaultContent(); // This will focus on the main login page
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close the logout alert 
			driver.switchTo().defaultContent();

		}
	}
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

	@DataProvider(name="LoginData") // Read the data from excel and map to the 2 dimension array
	String[][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";

		// Count no.of rows and columns in the excel data

		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int columnCount=XLUtils.getCellCount(path, "Sheet1",1);

		// Create 2 dimension array
		String logindata[][]= new String [rownum][columnCount];
		//Writing for loop to get the data
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<columnCount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j); // row i=1, column j=0 from excel sheet
			}
		}
		return logindata;


	}


}
