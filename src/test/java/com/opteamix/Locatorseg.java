package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locatorseg {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/contact_us");
		
		driver.manage().window().maximize();

	
	
	//locators
	
	//id
	
	WebElement Name = driver.findElement(By.name("name"));
	
	Name.sendKeys("harsha");
	
	//email
	
	WebElement Email = driver.findElement(By.name("email"));
	
	Email.sendKeys("abc@gmail.com");
	
    WebElement Subject = driver.findElement(By.name("subject"));
	
	Subject.sendKeys("I am a genius");
	
    WebElement YourMessage = driver.findElement(By.name("message"));
	
    YourMessage.sendKeys("Am I a genuis");
	
	
	
	}

}
