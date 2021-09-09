package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddDepositAmounts {
	
WebDriver ldriver;
	
	public  AddDepositAmounts(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[8]/a")
	@CacheLookup
	WebElement lnkDeposit;
	
	@FindBy(how=How.NAME, using="accountno")
	@CacheLookup
	WebElement accountNumber;
	
	@FindBy(how=How.NAME, using="ammount")
	@CacheLookup
	WebElement amount;
	
	@FindBy(how=How.NAME, using="desc")
	@CacheLookup
	WebElement description;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	
	
	public void clickDeposit() {
		lnkDeposit.click();
	}
	
	public void accountnum() {
		accountNumber.sendKeys("97208");
	}
	
	public void enterAmount() {
		amount.sendKeys("5000");
	}
	
	public void description() {
		description.sendKeys("Depositing");
	}
	
	public void submit() {
		btnSubmit.click();
	}
	
	

}
