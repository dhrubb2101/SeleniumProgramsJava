package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileSelenium {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement uploadfileEg = driver.findElement(By.xpath("//input[@name='upload']"));
		
		uploadfileEg.sendKeys("C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Desktop\\defect_report_HotelApplication.xlsx");
}

}
