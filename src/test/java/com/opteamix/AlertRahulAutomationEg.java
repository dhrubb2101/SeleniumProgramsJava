package com.opteamix;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertRahulAutomationEg {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement entername = driver.findElement(By.xpath("//input[@id='name']"));
		
		Thread.sleep(3000);
		
		entername.sendKeys("My name is Dhrubb");
		//alert 
		
		WebElement simplealt = driver.findElement(By.xpath("//input[@id='alertbtn']"));

		simplealt.click();

		Alert alt = driver.switchTo().alert();

		Thread.sleep(3000);

		alt.accept();

		// confirmational alert

		WebElement confalt = driver.findElement(By.xpath("//input[@id='confirmbtn']"));

		confalt.click();

		Alert alt1 = driver.switchTo().alert();
		
		String co = alt1.getText();
		System.out.println(co);

		Thread.sleep(3000);

		alt1.dismiss();
		
		//doubt


	}

}
