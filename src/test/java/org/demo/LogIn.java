package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn extends BrowserLaunch {
	public LogIn() {
		PageFactory.initElements(driver, this);
	}
   
	@FindBy(id="Email")
	private WebElement username;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='button-1 search-box-button']")
	private WebElement login;
	
	@FindBy(id="small-searchterms")
	private WebElement text;
	

	public WebElement getText() {
		return text;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	 
}
