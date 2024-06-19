package com.opteamix;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertEgFirefox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.geckodriver.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		WebElement simplealt = driver.findElement(By.xpath("//input[@name='alert']"));

		simplealt.click();

		Alert alt = driver.switchTo().alert();

		Thread.sleep(3000);

		alt.accept();

		// confirmational alert

		WebElement confalt = driver.findElement(By.xpath("//input[@name='confirmation']"));

		confalt.click();

		Alert alt1 = driver.switchTo().alert();

		Thread.sleep(3000);

		alt1.dismiss();
		
		WebElement promptalt = driver.findElement(By.xpath("//input[@name='prompt']"));
		
		if(promptalt.isDisplayed()) {
			
			promptalt.click();
		}

		promptalt.click();

		Alert alt2 = driver.switchTo().alert();
		
		//get the text of the alert and print it 

		Thread.sleep(3000);
		
		String exptext = alt2.getText();
		
		System.out.println(exptext);
		
		String actualtext = "I am prompt";
		
		if(exptext.equals(actualtext)) {
			System.out.println("The alert text is correct");
		}
		else {
			System.out.println("The alert is wrong.");
		}
		
		//input text into the alert
		
		alt2.sendKeys("Harsha");
		
		Thread.sleep(3000);
		
		alt2.accept();
		
		
		

	}

}
