package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertErrorMsgEgFB {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
			
			driver.manage().window().maximize();
			
			WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
			
			login.click();
			
			Thread.sleep(3000);
			
			WebElement errormsg = driver.findElement(By.xpath("//div[@class='_9ay7']"));
			
			String exptext = errormsg.getText();
			
			System.out.println(exptext);
			
			String actualtext = "The email address or mobile number you entered isn't connected to an account.";
			
			if(exptext.equals(actualtext)) {
				System.out.println("The expected text is equal to actual text");
			}
			else {
				System.out.println("The expected text is wrong.");
			}
			
			
			
			

	}

}
