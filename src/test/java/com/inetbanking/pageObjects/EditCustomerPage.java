package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
WebDriver ldriver;
	
	public  EditCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(linkText = "Edit Customer")
	@CacheLookup
	WebElement lnkEditCustomer;
	
	@FindBy(how=How.NAME, using = "cusid")
	@CacheLookup
	WebElement customerId;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(how=How.NAME, using= "telephoneno")
	@CacheLookup
	WebElement numtelephoneno;
	
	@FindBy(name ="sub")
	@CacheLookup
	WebElement btnnSubmit;
	

	public void lnkEditCustomer() {
		lnkEditCustomer.click();
	}
	public void custId(String cid) {
		customerId.sendKeys(cid);
	}
	
	public void submit() {
		btnSubmit.click();
	}
	
	public void custTelephone(String ctelephone) {
		numtelephoneno.clear();
		numtelephoneno.sendKeys(ctelephone);
		
	}
	
	public void custsubmit() {
		btnnSubmit.click();
	}

}
