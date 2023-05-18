package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeClass
	private void beforeclass() {
		System.out.println("BeforeClass");

	}

	@AfterClass
	private void afterclass() {
		System.out.println("AfterClass");

	}

	@BeforeMethod
	private void beforemethod() {
		System.out.println("BeforeMethod");

	}

	@Test(priority=-10)
	private void test1() {
		System.out.println("method1");

	}

	@Test(priority=-5)
	private void test2() {
		System.out.println("method2");

	}

	@Test(priority=4)
	private void test3() {
		System.out.println("method3");
	}

	@Test(priority=2)
	private void test4() {
		System.out.println("method4");
	}

	@Test(priority=0)
	private void test5() {
		System.out.println("method5");
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("AfterMethod");

	}
}
