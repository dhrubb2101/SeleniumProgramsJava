package com.opteamix;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multicheckRadioButtons {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				driver.manage().window().maximize();
				
				List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
				
				int size = radios.size();
				
				for(int i = 0; i<size;i++) {
					
					Thread.sleep(1000);
					
					radios.get(i).click();
				}
	
	}
				

}
