package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement dropdw = driver.findElement(By.xpath( "//select[@id='dropdown-class-example']"));
		
		Select sl = new Select(dropdw);
		
		sl.selectByVisibleText("Option1");
		
		Thread.sleep(3000);
		
		
		sl.selectByValue("option2");
		
		Thread.sleep(3000);
		

		sl.selectByIndex(3);
		
		Thread.sleep(3000);
		
		
	}

}
