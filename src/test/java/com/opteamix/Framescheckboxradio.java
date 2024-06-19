package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framescheckboxradio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.manage().window().maximize();
		
		WebElement frame1 =  driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//frame using web element
		
		driver.switchTo().frame(frame1);
		
		//frame using index
		
//		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		WebElement radio =  driver.findElement(By.xpath("//label[@for = 'radio-2']"));
		
		Thread.sleep(3000);

		radio.click();
		
		Thread.sleep(3000);

		
		

	}

}
