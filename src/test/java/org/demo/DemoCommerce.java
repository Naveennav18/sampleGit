package org.demo;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoCommerce extends BrowserLaunch {
	@BeforeClass
	private void beforeclass() {
		getDriver("chrome");
	}

	@AfterClass
	private void afterclass() {

	}

	@BeforeMethod
	private void beforemethod() {

	}

	@AfterMethod
	private void aftermethod() {

	}

	@Test
	private void test() {

		launch("https://demo.nopcommerce.com/");

	homepage h = new homepage();

		WebElement login = h.getLogin();
		click(login);

		WebElement gender = h.getGender();
		click(gender);

		WebElement firstname = h.getFirstname();
		typetext(firstname, "Dinesh");

		WebElement lastname = h.getLastname();
		typetext(lastname, "kumar");

		WebElement day = h.getDay();
		selectbyvalue(day, "2");

		WebElement month = h.getMonth();
		selectbyvalue(month, "10");

		WebElement year = h.getYear();
		selectbyvalue(year, "1914");

		WebElement email = h.getEmail();
		typetext(email, "naveen@gmail.com");

		WebElement pass = h.getPass();
		typetext(pass, "123456789");

		WebElement cnfmpass = h.getCnfmpass();
		typetext(cnfmpass, "123456789");

		WebElement register = h.getRegister();
		click(register);

		WebElement login1 = h.getLogin1();
		click(login1);

		LogIn l = new LogIn();

		WebElement username = l.getUsername();
		typetext(username, "naveen@gmail.com");

		WebElement password = l.getPassword();
		typetext(password, "123456789");

		WebElement login2 = l.getLogin();
		click(login2);
		
		
		
//      Alert al=driver.switchTo().alert();
//		al.accept();
//
//		WebElement login3 = l.getLogin();
//		click(login3);

	}
}
