package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginOrangeErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement psw = driver.findElement(By.name("password"));
		Thread.sleep(1000);
		 psw.click();
		psw.sendKeys("admin123");
		
		Thread.sleep(1000);
		
		WebElement log = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Thread.sleep(1000);
        log.click();
        
		Thread.sleep(3000);
		
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]"));
		
		String exptext = errormsg.getText();
		
		System.out.println(exptext);
		
		String actualtext = "Required";
		
		if(exptext.equals(actualtext)) {
			System.out.println("The expected text is equal to actual text");
		}
		else {
			System.out.println("The expected text is wrong.");
		}
		

	}

}
