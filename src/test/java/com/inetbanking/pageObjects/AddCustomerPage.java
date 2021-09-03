package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
WebDriver ldriver;
	
	public  AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	@FindBy(how=How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.NAME, using= "name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME, using= "rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.ID_OR_NAME, using= "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how=How.NAME, using= "addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how=How.NAME, using= "city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how=How.NAME, using= "state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how=How.NAME, using= "pinno")
	@CacheLookup
	WebElement numpincode;
	
	@FindBy(how=How.NAME, using= "telephoneno")
	@CacheLookup
	WebElement numtelephoneno;
	
	@FindBy(how=How.NAME, using= "emailid")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(how=How.NAME, using= "password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
		
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender) {
		rdGender.click();
			}
	public void custdob(String mm, String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custAddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void custState(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void custPincode(String cpincode) {
		numpincode.sendKeys(String.valueOf(cpincode));
	}
	
	public void custTelephone(String ctelephone) {
		numtelephoneno.sendKeys(ctelephone);
		
	}
	
	public void custEmail(String cemail) {
		txtemail.sendKeys(cemail);
	}
	
	public void custPassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}
	
	public void custsubmit() {
		btnSubmit.click();
	}

}
