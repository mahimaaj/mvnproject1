package com.alg.mvnproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	
	public static WebDriver driver;
	
	
	@Test
	
	public void test(){
		System.setProperty("webdriver.chrome.driver", "C:\\Working\\Workspace\\SeleniumProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("*******************");
		System.out.println("Test Passed");
		System.out.println("*******************");
		driver.quit();
	}
	@Test
	public void testMethod1() {
		System.out.println("########################");
		System.out.println("This is test 1");
		System.out.println("Test pass");
		
	}

	@Test
	public void testMethod2() {
		System.out.println("########################");
		System.out.println("This is test 2");
		System.out.println("Test pass");
		
	}

	@Test
	public void testMethod3() {
		System.out.println("########################");
		System.out.println("This is test 3");
		System.out.println("Test pass");
		
	}

	@Test
	public void testMethod4() {
		System.out.println("########################");
		System.out.println("This is test 4");
		System.out.println("Test pass");
		
	}

	@Test
	public void testMethod5() {
		System.out.println("########################");
		System.out.println("This is test 5");
		System.out.println("Test pass");
		
	}
	
}
