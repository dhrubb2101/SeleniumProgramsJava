package com.opteamix;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlertEg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://dummypoint.com/Frame.html");
		
		driver.manage().window().maximize();
		
		WebElement frame1alert =  driver.findElement(By.xpath("//iframe[@id='f1']"));
		
		driver.switchTo().frame(frame1alert);
		
		WebElement promptalerteg =  driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		
		promptalerteg.click();
		Thread.sleep(3000);
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		
		

	}

}
