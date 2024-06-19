package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMTtask {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.makemytrip.com/");

			driver.manage().window().maximize();

			Thread.sleep(9000);
			
			WebElement FromEg = driver.findElement(By.xpath("//span[normalize-space()='From']"));
			
			Thread.sleep(3000);

			FromEg.click();
			
			Thread.sleep(3000);
			
			WebElement dropFrom = driver.findElement(By.xpath("(//p[contains(text(),'Bengaluru, India')])[1]"));
			dropFrom.click();
			
			Thread.sleep(3000);
			
			WebElement ToEg = driver.findElement(By.xpath("//span[normalize-space()='To']"));

			Thread.sleep(3000);

			ToEg.click();

			Thread.sleep(3000);

			WebElement dropto = driver.findElement(By.xpath("(//p[contains(text(),'Mumbai, India')])[1]"));
			
			Thread.sleep(3000);

			dropto.click();

			Thread.sleep(3000);
			
			//calender picker
						
			WebElement CalenderEg = driver.findElement(By.xpath("//span[normalize-space()='Departure']"));
			
			Thread.sleep(3000);

			CalenderEg.click();
			
			Thread.sleep(3000);
			
			WebElement calenderpickerEg = driver.findElement(By.xpath("//div[@aria-label='Wed Jun 12 2024']"));
			
			Thread.sleep(3000);

			calenderpickerEg.click();
			
			Thread.sleep(3000);
			
//			WebElement travellernum = driver.findElement(By.xpath("//span[@class='lbl_input appendBottom5']"));
//			
//			Thread.sleep(5000);
//
//			travellernum.click();
//			
//			Thread.sleep(5000);
			
			WebElement SearchEg = driver.findElement(By.xpath("//a[contains(text(),'Search')]"));

			Thread.sleep(5000);

			SearchEg.click();

			Thread.sleep(5000);
			
			

			



	}

}
