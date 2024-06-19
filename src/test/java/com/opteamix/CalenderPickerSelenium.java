package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPickerSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		Thread.sleep(9000);
		
		WebElement CalenderEg = driver.findElement(By.xpath("//span[normalize-space()='Departure']"));
		
		Thread.sleep(3000);

		CalenderEg.click();
		
		Thread.sleep(3000);
		
		WebElement calenderpickerEg = driver.findElement(By.xpath("//div[@aria-label='Tue Jun 11 2024']"));
		
		Thread.sleep(3000);

		calenderpickerEg.click();
		
		Thread.sleep(3000);

		
		
		
		
		

	}

}
