package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		driver.manage().window().maximize();
		
		//locators
		
		//id
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type = 'checkbox'])[1]"));
		
		if(checkbox1.isDisplayed()  && !checkbox1.isSelected()) {
			checkbox1.click();
		}

	}

}
