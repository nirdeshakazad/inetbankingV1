package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewAccount {

WebDriver ldriver;
	
	public  AddNewAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[5]/a")
	@CacheLookup
	WebElement lnkAddNewAccount;
	
	@FindBy(how=How.NAME, using="cusid")
	WebElement CustomerID;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select/option[1]")
	WebElement AccountType;
	
	@FindBy(how=How.NAME, using="inideposit")
	WebElement InitialDeposit;
	
	@FindBy(name="button2")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void clickAddNewAccount() {
		lnkAddNewAccount.click();
		
	}
	
	public void customerId() {
		CustomerID.sendKeys("16161");
	}
	
	public void accountType() {
		AccountType.click();
	}
	
	public void initialDeposit() {
		InitialDeposit.sendKeys("25000");
	}
	
	public void submit() {
		btnSubmit.click();
	}
	
	
	
	
	
}

