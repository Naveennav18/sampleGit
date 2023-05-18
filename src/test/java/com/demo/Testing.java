package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	@Test
	@Parameters({"username","Password" })
	
	private void test1(String email, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");11
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(email);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(pass);
		

	}

}
