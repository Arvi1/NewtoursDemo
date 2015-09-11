package com.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
	}	
	@Test
	public void Login() throws Exception{
		
		driver.findElement(By.name("userName")).sendKeys("user1@gmail.com");;
		driver.findElement(By.name("password")).sendKeys("user1");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();	
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Flights")).click();		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Hotels")).click();		
		System.out.println(driver.getTitle());
		
	}	
	/*@Test
	public void FlightBooking(){
		driver.findElement(By.linkText("Flights")).click();		
		System.out.println(driver.getTitle());
	}*/	
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
}
