package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//Pre-conditions annotation--starting with @Before
	@BeforeSuite //1
	public void setUp() {
		System.out.println("BeforeSuite--setup system properties");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("BeforeTest--launch chrome browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("BeforeClass--login to app");
	}
	
	
	/*
	 * @BeforeMethod
	 * @Test--1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test--2
	 * @AfterMethod
	 * 
	 */

	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("BeforeMethod--enter URL");
	}
	
	
	//test cases--starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("Test--Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Test--search test");
	}
	
	//post conditions--starting with @After
	
	@AfterMethod //6
	public void logOut() {
		System.out.println("AfterMethod--logout from app");
	}
	
	@AfterClass  //7
	public void closeBrowser() {
		System.out.println("AfterClass--Close Browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("AfterTest--deleteAllCookies");
	}
	
	
}
