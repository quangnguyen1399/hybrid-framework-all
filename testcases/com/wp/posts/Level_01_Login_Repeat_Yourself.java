package com.wp.posts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Level_01_Login_Repeat_Yourself {
	WebDriver driver;
	String projectLocation = System.getProperty("user.dir");
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\browserDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/////////////
	}

	@Test
	public void TC_01_New_Post() {
	}

	@Test
	public void TC_02_View_Post() {
	}

	@Test
	public void TC_03_Edit_Post() {
	}

	@Test
	public void TC_04_Make_Post_Private() {
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
