package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilites.ReadConfig;

public class BaseClass {
	
	// Create an object of ReadConfig class
	
	ReadConfig RC= new ReadConfig();
	
	
	public String baseURL = RC.getApplicationURL();
	public String username= RC.getusername();
	public String password=RC.getpassword();
	public static WebDriver driver;
	//public static Logger logger;
	
	@Parameters ("browser")
	@BeforeClass
	public void setup(String browser) {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Mini_Project\\inetBanking_V1\\Drivers\\chromedriver.exe");
		//driver= new ChromeDriver();
		if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",RC.getfirefoxpath());
			driver=new FirefoxDriver();
		}
		else if (browser.equals("edge")) 
		{
			System.setProperty("webdriver.edge.driver", RC.getedgepath());
			driver=new EdgeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
				
	}
	
	@AfterClass
	public void tearDown() {
	driver.close();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot has been captured");
		
	}
	
	public String randomstring() {

		String generatedstring= RandomStringUtils.randomAlphabetic(8); // 8- 8characters string
		return(generatedstring);

	}

	public String randomNumber() {

		String generatedstring2= RandomStringUtils.randomNumeric(8); 
		return(generatedstring2);

	}
	
	public String randomNumber2() {

		String generatedstring3= RandomStringUtils.randomNumeric(10); 
		return(generatedstring3);

	}
	
	public boolean isAlertPresent(){
        try{
            driver.switchTo().alert();
            return true;
        }//try
        catch(Exception e){
            return false;
        }//catch
    }

}
