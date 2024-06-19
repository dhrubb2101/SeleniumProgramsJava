package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEg {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement mousehov =  driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Thread.sleep(3000);
		
		mousehov.click();
		
		Thread.sleep(3000);

		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);

		
		act.moveToElement(mousehov);
		
		Thread.sleep(3000);

		
		act.clickAndHold(mousehov);
		
		Thread.sleep(3000);

		
		WebElement mouseholdeg =  driver.findElement(By.xpath("//a[normalize-space()='Top']"));
		
		Thread.sleep(3000);

		
		act.moveToElement(mouseholdeg);
		
		Thread.sleep(3000);
		
		act.click();
		
		Thread.sleep(3000);
		
		act.release().perform();

	}

}
