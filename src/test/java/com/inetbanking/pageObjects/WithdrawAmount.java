package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WithdrawAmount {
	
WebDriver ldriver;
	
	public WithdrawAmount (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[9]/a")
	@CacheLookup
	WebElement lnkWithDrawl;
	
	@FindBy(how=How.NAME, using="accountno")
	@CacheLookup
	WebElement enteraccountNumber;
	
	@FindBy(how=How.NAME, using="ammount")
	@CacheLookup
	WebElement enteramount;
	
	@FindBy(how=How.NAME, using="desc")
	@CacheLookup
	WebElement description;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void withdrawlLink() {
		lnkWithDrawl.click();
	}
	
	public void enterAccNumber() {
		enteraccountNumber.sendKeys("97208");
	}
	
	public void enterAmnt() {
		enteramount.sendKeys("1200");
	}
	
	public void enterDescription() {
		description.sendKeys("Withdrawl");
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	

}
