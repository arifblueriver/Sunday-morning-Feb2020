package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open facebook
		driver.get("https://www.google.com/");	
		
		driver.findElement(By.xpath("//*[contains(text(),'Gmail')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'Sign in')])[2]")).click();
		Thread.sleep(3000);
		
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		String lastWindowHandle = "";
		for(String handle : allWindowHandles)
		{
		
				System.out.println("Switching to window - > " + handle);
				System.out.println("Navigating to google.com");
				driver.switchTo().window(handle); 
				lastWindowHandle = handle;
				
				}
		driver.findElement(By.xpath("//*[@class='Xb9hP']/input"))
		.sendKeys("sarowerhome@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='Xb9hP']/input")).submit();
		WebElement signin =driver.findElement(By.cssSelector("span.CwaK9"));
		//signin.submit();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", signin);
		
		Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class='Xb9hP']/input"))
	.sendKeys("tanvirj9");
	Thread.sleep(3000);
	
	WebElement login =driver.findElement(By.cssSelector("span.RveJvd.snByac"));
	executor.executeScript("arguments[0].click();", login);
	
	}
	}
	

