package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends BrowserLaunch {
	public homepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	private WebElement login;
	
	@FindBy(id="gender-male")
	private WebElement gender;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(name="DateOfBirthDay")
	private WebElement day;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	private WebElement month;
	
	@FindBy(name="DateOfBirthYear")
	private WebElement year;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement pass;
	
	@FindBy(id="ConfirmPassword")
	private WebElement cnfmpass;
	
	@FindBy(id="register-button")
	private WebElement register;
	
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement login1;

	public WebElement getLogin1() {
		return login1;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getCnfmpass() {
		return cnfmpass;
	}

	public WebElement getRegister() {
		return register;
	}
	   
	

}
