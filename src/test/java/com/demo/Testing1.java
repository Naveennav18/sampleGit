package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing1 {
	@Test
	private void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("title is verified");

		WebElement email = driver.findElement(By.id("email"));
		boolean displayed = email.isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("username is verified");
		email.sendKeys("greens@123");
		
		WebElement password = driver.findElement(By.id("pass"));
		boolean displayed2 = password.isDisplayed();
		Assert.assertTrue(displayed2);
		System.out.println("password is verified");
		password.sendKeys("123456789");
		
		WebElement btnclick = driver.findElement(By.name("login"));
		boolean displayed3 = btnclick.isDisplayed();
		Assert.assertTrue(displayed3);
		System.out.println("login is verified");
		btnclick.click();

	}

}
