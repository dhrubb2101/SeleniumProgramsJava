package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");
		
		WebElement Ele = driver.findElement(By.xpath("//span[normalize-space()='Downloads']"));
		
		//double click
		
		Actions act = new Actions(driver);
		
		act.doubleClick(Ele).perform();
		Thread.sleep(3000);
		//context click
		WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Documentation')]"));
		
		act.contextClick(ele1).perform();
		Thread.sleep(3000);
		
	}


}
