package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverEg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/hovers");
		
		driver.manage().window().maximize();
		
		WebElement UserProfileEg1 =  driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		act.moveToElement(UserProfileEg1).perform();
		
		Thread.sleep(3000);
		
		WebElement UserProfileEg2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));

		Actions act1 = new Actions(driver);
		
		Thread.sleep(3000);

		act1.moveToElement(UserProfileEg2).perform();
		
		Thread.sleep(3000);

		WebElement UserProfileEg3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

		Actions act2 = new Actions(driver);

		act2.moveToElement(UserProfileEg3).perform();
		
		Thread.sleep(3000);

		


	}

}
