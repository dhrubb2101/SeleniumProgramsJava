package com.opteamix;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multicheckcheckboxbuttons {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://rahulshettyacademy.com/AutomationPractice/");
					
					driver.manage().window().maximize();
					
					List<WebElement> dropdw = driver.findElements(By.xpath("//select[@id='dropdown']"));
					
					Select sl = new Select(dropdw);
					
					//Select by visible text
					
					sl.selectByVisibleText("Option 2");
						
						Thread.sleep(3000);
						
					//Select by value
						
					sl.selectByValue("1");
					
				    	Thread.sleep(3000);

					
					//select by index
					
					sl.selectByIndex(2);
		}

	}

}
