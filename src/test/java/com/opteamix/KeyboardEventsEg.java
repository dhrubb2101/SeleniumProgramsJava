package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventsEg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement email =  driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions builder = new Actions(driver);
		
		Action seriesofaction = builder.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys("Dhrubb is a genuis").build();
		
		seriesofaction.perform();
		
		Thread.sleep(3000);


	}

}
