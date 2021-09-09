package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GenerateMiniStatement {
WebDriver ldriver;
	
	public  GenerateMiniStatement(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[13]/a")
	@CacheLookup
	WebElement lnkMiniStatement;
	
	@FindBy(how=How.NAME, using="accountno")
	@CacheLookup
	WebElement accountNumber;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void GenerateMinStatement() {
		lnkMiniStatement.click();
	}
	
	public void enterAccountnum() {
		accountNumber.sendKeys("97208");
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	
}
