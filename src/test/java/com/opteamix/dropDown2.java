package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
	
		WebElement About = driver.findElement(By.xpath("//a[@id='navbarDropdown']"));
		
		About.click();
		
		Thread.sleep(3000);
		
		WebElement ecosystem = driver.findElement(By.xpath("//a[normalize-space()='Ecosystem']"));
		
		ecosystem.click();
		
		Thread.sleep(3000);

	}

}
