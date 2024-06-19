package com.opteamix;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		driver.manage().window().maximize();
		
		WebElement simplealt = driver.findElement(By.xpath("//input[@name='alert']"));
		
		simplealt.click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alt.accept();
		
		//confirmational alert 
		
		WebElement confalt = driver.findElement(By.xpath("//input[@name='confirmation']"));

		confalt.click();
		
		Alert alt1 = driver.switchTo().alert();

		Thread.sleep(3000);

		alt1.dismiss();
		
		
		
		
	}

}
