package com.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RegisterTest {
  
	WebDriver driver;
	@BeforeTest
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
	}	
	@Test
	public void Login(){
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("email")).sendKeys("user2");;
		driver.findElement(By.name("password")).sendKeys("user2");
		driver.findElement(By.name("confirmPassword")).sendKeys("user2");
		driver.findElement(By.name("register")).click();	
		System.out.println(driver.getTitle());
				
	}	
	
	@AfterTest
	public void afterTest(){
		driver.quit();
	}

}
